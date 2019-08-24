
package projectgameon.Player;

public class Level {
    
    private Personagem personagem;

    public Level(Personagem personagem) {
        this.personagem = personagem;
    }

    public Level() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void levelup(){         
        this.personagem.setAtk(this.personagem.getAtk()+2);
        this.personagem.setDef(this.personagem.getDef()+2);
        this.personagem.setHpatual(this.personagem.getHpatual()+2);
        this.personagem.setHptotal(this.personagem.getHptotal()+2);
        this.personagem.setSpd(this.personagem.getSpd()+2);
        this.personagem.setLvl(this.personagem.getLvl()+1);
        this.personagem.setExp(this.personagem.getExp()-this.personagem.getExptotal());
        this.personagem.setExptotal(this.personagem.getExptotal()+25);
    }
    
    public void Init(){
        this.personagem.setAtk(this.personagem.getAtk()+(2*this.personagem.getLvl()));
        this.personagem.setDef(this.personagem.getDef()+(2*this.personagem.getLvl()));
        this.personagem.setHpatual(this.personagem.getHpatual()+(2*this.personagem.getLvl()));
        this.personagem.setHptotal(this.personagem.getHptotal()+(2*this.personagem.getLvl()));
        this.personagem.setSpd(this.personagem.getSpd()+(2*this.personagem.getLvl()));       
    }
    
}
