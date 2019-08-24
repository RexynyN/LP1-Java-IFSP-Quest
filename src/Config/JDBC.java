/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projectgameon.Player.Personagem;
import projectgameon.Player.Player;

/**
 *
 * @author foxwalker
 */
public class JDBC {
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = ("jdbc:mysql://sql174.main-hosting.eu:3306/u711482978_game");
            String username = ("u711482978_game");
            String password = ("hardcore333");
            
            connection = DriverManager.getConnection(url, username, password);
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
            JOptionPane.showConfirmDialog(null, "Erro na conexão, verifique o acesso a internet.");
        }              
        
        return connection;
    }
    
    public static void Auth(Login data){
        try(Connection connection = JDBC.getConnection()){
            String query = ("select * from jogador");
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();                        
            
            int i = 0;        
            while(rs.next()){
                if(data.Logar(rs.getString("login"), rs.getString("senha"))){
                    return;
                }else{
                    
                }
                i++;
            } 
            JOptionPane.showMessageDialog(null, "Erro ao logar. Verifique seus dados!");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao logar. Verifique sua conexão!");
            System.out.print(ex);
        }        
    }

    public static Player getPlayer(Player playerData) {
        try(Connection connection = JDBC.getConnection()){            
            String query = ("select * from jogador where login='"+playerData.getLogin()+"'");
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();                        
            
            int i = 0;        
            while(rs.next()){
                playerData.setHighscore(rs.getInt("HighScore"));
                playerData.setPersonagemA(getPersonagem(playerData.getLogin()+"A"));
                playerData.setPersonagemB(getPersonagem(playerData.getLogin()+"B"));
                playerData.setPersonagemC(getPersonagem(playerData.getLogin()+"C"));                
                i++;
            } 
            return playerData;
        }catch(SQLException ex){;
            System.out.print(ex);
        }  
        return playerData;
    }
    
    public void register(Login data){
        try(Connection connection = JDBC.getConnection()){
            if(verificaUser(data.getLogin())){
                JOptionPane.showMessageDialog(null, "Usuário já existe, por favor escolha outro nickname.");   
                return;
            }
            String query = ("insert into jogador (login, senha) ")+("VALUES ('"+data.getLogin()+"', '"+data.getSenha()+"')");
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);                                      
            
            ps.executeUpdate();            
            data.setLogged(true);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");            
        }catch(SQLException ex){
            System.out.print(ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar. Verifique sua conexão!");
        }   
    }
    
    public Player updateUser(Player playerData, int score){
        try(Connection connection = JDBC.getConnection()){           
            String query = ("UPDATE jogador SET HighScore="+score+" where login='"+playerData.getLogin()+"'");
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);                                      
            
            ps.executeUpdate();            
            getPlayer(playerData);
        }catch(SQLException ex){
            System.out.print(ex);            
        }   
        
        return null;
    }
    
    public boolean verificaUser(String user){
        try(Connection connection = JDBC.getConnection()){
            String query = ("select * from jogador");
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();                        
            
            int i = 0;        
            while(rs.next()){
                if(rs.getString("login").equals(user))
                    return true;                    
            }
            return false;
            
        }catch(SQLException ex){
            System.out.print(ex);
        }
        return false;
    }
    
    public void Clear(Player playerData){
        try(Connection connection = JDBC.getConnection()){
            String query;
            query = ("UPDATE personagem SET level=0,exp=0,expTotal=0,nome=null,classe=null,atk=0,hptotal=0,hpatual=0,spd=0,def=0 where codPersonagem='"+playerData.getPersonagemA().getId()+"' or codPersonagem='"+playerData.getPersonagemB().getId()+"' or codPersonagem='"+playerData.getPersonagemC().getId()+"'");
            
            playerData = updateUser(playerData, 0);
             
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);           
            ps.executeUpdate();
            
        }catch(SQLException ex){
            System.out.print(ex);
        }      
    }
    
    public static Personagem getPersonagem(String id){
        try(Connection connection = JDBC.getConnection()){
            Personagem personagem = new Personagem();
            String query = ("select * from personagem where codPersonagem='"+id+"'");
            
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();                                    
            int i = 0;        
            
            while(rs.next()){
               personagem.setLvl(rs.getInt("level"));
               personagem.setExp(rs.getInt("exp"));
               personagem.setExp(rs.getInt("expTotal"));
               personagem.setNome(rs.getString("nome"));
               personagem.setClasse(rs.getString("classe"));
               personagem.setAtk(rs.getInt("atk"));
               personagem.setHptotal(rs.getInt("hptotal"));
               personagem.setHpatual(rs.getInt("hpatual"));
               personagem.setSpd(rs.getInt("spd"));
               personagem.setDef(rs.getInt("def"));
               personagem.setId(rs.getString("codPersonagem"));
               i++;
            }           
            return personagem;
        }catch(SQLException ex){
            System.out.print(ex);
        }    
        return (null);
    
    }
    
    public Player cadastraPersonagemMago(Player playerData, String nome, String slot){
        try(Connection connection = JDBC.getConnection()){            
            String query = ("UPDATE personagem SET level=0,exp=0,expTotal=20,nome='"+nome+"',classe='mago',atk=100,hptotal=50,hpatual=50,spd=10,def=20 where codPersonagem='"+playerData.getLogin()+slot+"'");
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();            
            playerData = getPlayer(playerData);                        
            return playerData;
        }catch(SQLException ex){
            System.out.print(ex);            
        }
        return playerData;
    }
    
    public Player cadastraPersonagemArqueiro(Player playerData, String nome, String slot){
        try(Connection connection = JDBC.getConnection()){            
            String query = ("UPDATE personagem SET level=0,exp=0,expTotal=20,nome='"+nome+"',classe='arqueiro',atk=50,hptotal=100,hpatual=100,spd=35,def=40 where codPersonagem='"+playerData.getLogin()+slot+"'");
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();            
            playerData = getPlayer(playerData);                        
            return playerData;
        }catch(SQLException ex){
            System.out.print(ex);            
        }
        return playerData;
    }
    
    public Player cadastraPersonagemGuerreiro(Player playerData, String nome, String slot){
        try(Connection connection = JDBC.getConnection()){            
            String query = ("UPDATE personagem SET level=0,exp=0,expTotal=20,nome='"+nome+"',classe='guerreiro',atk=20,hptotal=200,hpatual=200,spd=15,def=80 where codPersonagem='"+playerData.getLogin()+slot+"'");
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();            
            playerData = getPlayer(playerData);                        
            return playerData;
        }catch(SQLException ex){
            System.out.print(ex);            
        }
        return playerData;
    }
    
}
