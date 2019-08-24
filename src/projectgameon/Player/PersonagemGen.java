
package projectgameon.Player;



public class PersonagemGen {
    
    /**
     *
     */
    public void genPersonagem(){
           
        Personagem stats = new Personagem();
        stats.setLvl(1);
        stats.setExp(0);
        stats.setExptotal(50);
        stats.setClasse(null);
        stats.setAtk(0);
        stats.setHptotal(0);
        stats.setNome(null);
        stats.setSpd(0);
        stats.setDef(0);
    }
    
}
