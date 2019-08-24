
package projectgameon.Enemy;

import projectgameon.Player.*;

public class Enemy {

    private int hptotal;
    private int hpatual;
    private int atk;
    private int def;
    private int spd;
    private String[] pRaca = new String[3];
    private String[] pClasse = new String[3];
    private String raca;
    private String classe;
    private int exp;
    
    public void presetEnemy(){
        /*raças*/
        this.pRaca[0] = "Goblin";
        this.pRaca[1] = "Esqueleto";
        this.pRaca[2] = "Duende";
        
        /*classes*/
        this.pClasse[0] = "Espadachim";
        this.pClasse[1] = "Druida";
        this.pClasse[2] = "caçador";
    }
    
    public void GenEnemy(){
        this.raca="";
        this.classe="";
        this.setHptotal(0);
        this.atk=0;
        this.def=0;
        this.spd=0;
        this.exp=0;
        this.setHpatual(0);
        
        this.raca=this.pRaca[(int) (Math.random() * pRaca.length)];
        this.classe= this.pClasse[(int) (Math.random() * pClasse.length)];
        Personagem player = new Personagem();
        
        this.setHptotal(50*(1+(player.getLvl()/10))+(int) (Math.random() * 3));
        this.atk = 10*(1+(player.getLvl()/10))+(int) (Math.random() * 3);
        this.def = 5*(1+(player.getLvl()/10))+(int) (Math.random() * 3);
        this.spd = 7*(1+(player.getLvl()/10))+(int) (Math.random() * 3);
        this.setHpatual(this.getHptotal());
        this.exp = 4*(1+(player.getLvl()/10))+(int) (Math.random() * 5);
        
    }
    
    /**
     * @return the hptotal
     */
    public int getHptotal() {
        return hptotal;
    }

    /**
     * @param hptotal the hptotal to set
     */
    public void setHptotal(int hptotal) {
        this.hptotal = hptotal;
    }

    /**
     * @return the hpatual
     */
    public int getHpatual() {
        return hpatual;
    }

    /**
     * @param hpatual the hpatual to set
     */
    public void setHpatual(int hpatual) {
        this.hpatual = hpatual;
    }

    /**
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @return the def
     */
    public int getDef() {
        return def;
    }

    /**
     * @return the spd
     */
    public int getSpd() {
        return spd;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }
}




