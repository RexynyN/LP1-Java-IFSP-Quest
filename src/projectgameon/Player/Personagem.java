
package projectgameon.Player;

public class Personagem {
    
    private int lvl;
    private int exp;
    private int exptotal;
    private String nome;
    private String classe;
    private int atk;
    private int hptotal;
    private int hpatual;
    private int spd;
    private int def;
    private String id;

    
    /*
        
        Exp pra subir de nivel
        Exp atual
        Nome do personagem *
        Classe do personagem 
        Ataque
        Vida total
        Vida atual
        Velocidade 
        Defesa
    
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExptotal() {
        return exptotal;
    }

    public void setExptotal(int exptotal) {
        this.exptotal = exptotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHptotal() {
        return hptotal;
    }

    public void setHptotal(int hptotal) {
        this.hptotal = hptotal;
    }

    public int getHpatual() {
        return hpatual;
    }

    public void setHpatual(int hpatual) {
        this.hpatual = hpatual;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    
    
    
    
}
