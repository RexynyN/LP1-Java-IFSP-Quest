/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgameon.Player;

import Config.Login;

/**
 *
 * @author foxwalker
 */
public class Player extends Login {
    private Personagem personagemA;
    private Personagem personagemB;
    private Personagem personagemC;
    private int highscore;

    public Player(String login, String senha) {
        super(login, senha);
    }

    public Personagem getPersonagemA() {
        return personagemA;
    }

    public void setPersonagemA(Personagem personagemA) {
        this.personagemA = personagemA;
    }

    public Personagem getPersonagemB() {
        return personagemB;
    }

    public void setPersonagemB(Personagem personagemB) {
        this.personagemB = personagemB;
    }

    public Personagem getPersonagemC() {
        return personagemC;
    }

    public void setPersonagemC(Personagem personagemC) {
        this.personagemC = personagemC;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
    
    
}
