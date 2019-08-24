/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectgameon.Player.Personagem;

/**
 *
 * @author aluno
 */
public class Config {
    private FileReader ConfigFile;
    
    public Config(String directory) throws FileNotFoundException{
        this.ConfigFile = new FileReader (directory);
    }
    
    //devolve tds os alunos 
    public Login readFile() throws IOException{
        // esse try ele vai TENTAR rodar o codigo entre chaves caso der erro mostra 
        try {
            int i;
            String line = "";   
            String[] lineSplited;
            String[] wordSplited;
            Login data = new Login(null, null);
            
            while((i=this.ConfigFile.read()) != -1){
                line = line + (char) i;
            }
            lineSplited = line.split("\\;");
            
            for(i=0; i < lineSplited.length;i++){
                wordSplited = lineSplited[i].split("=");
                if(wordSplited[0].equals("user")){
                    data.setLogin(wordSplited[1]);
                }else if(wordSplited[0].equals("passwd")){
                    data.setSenha(wordSplited[1]);
                }
            }
            return data;
        } catch (FileNotFoundException ex) {
            //erro 
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
