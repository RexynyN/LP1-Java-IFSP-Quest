
package projectgameon;

import projectgameon.Enemy.Enemy;
import projectgameon.Player.Level;
import projectgameon.Player.Personagem;

public class BattleSystem {
    
    private int PlayerHP;
    private int PlayerHPTotal;
    private int enemyHP;
    private int enemyHPTotal;
    
    Personagem stats = new Personagem();
    Enemy enemStats = new Enemy();
    Level lvlup = new Level();
    
    public BattleSystem(Personagem personagem){
        this.stats = personagem;
    }
    
    public boolean luta(){
        enemStats.presetEnemy();
        enemStats.GenEnemy();
        setEnemyHPTotal();
        setPlayerHPTotal();
        setEnemyHP(enemyHPTotal);
        setPlayerHP(PlayerHPTotal);
        if (enemStats.getSpd()>stats.getSpd()){
            boolean resultado = enemAtk();
            stats.setHpatual(PlayerHP);
            if (resultado = false){
                return false;
            }        
        }else{
            boolean enemMorte = PlayAtk();
            stats.setHpatual(PlayerHP);
            if (enemMorte = true){
                stats.setExp(enemStats.getExp());
                if (stats.getExp()>=stats.getExptotal()){
                    lvlup.levelup();
                }
                return luta();
            
            }
        }
        
        return false;
    }
    
    
    public int getPlayerHP() {
        return PlayerHP;
    }

    
    public void setPlayerHP(int playerHP) {
        this.PlayerHP = playerHP;
    }

    
    public int getPlayerHPTotal() {
        return PlayerHPTotal;
    }

    
    public void setPlayerHPTotal() {
        this.PlayerHPTotal = stats.getHptotal();
    }

    
    public int getEnemyHP() {
        return enemyHP;
    }

    
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    
    public int getEnemyHPTotal() {
        return enemyHPTotal;
    }

    
    public void setEnemyHPTotal() {
        this.enemyHPTotal = enemStats.getHptotal();
    }
    
    public int enemHit(int PDef,int EAtk){
        
        if (PDef>=EAtk){
            return 1;
        }else{
            return EAtk-PDef;
        }
        
    }
    public boolean enemAtk(){
        PlayerHP = PlayerHP - enemHit(stats.getDef(),enemStats.getAtk());
        return PlayerHP > 0;
    }
    public int playHit(int EDef,int PAtk){
        
        if (EDef>=PAtk){
            return 1;
        }else{
            return PAtk-EDef;
        }
        
    }
    public boolean PlayAtk(){
        enemyHP = enemyHP - enemHit(enemStats.getDef(),stats.getAtk());
        return enemyHP > 0;
    }
}
