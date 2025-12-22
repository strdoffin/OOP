/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    public int getPlayerNumber(){
        return this.playerNumber;
    }
    public String getPosition(){
        return this.position;
    }
    public void setPosition(String p){
        this.position = p;
    }
    public void setPlayerNumber(int n){
        this.playerNumber = n;
    }
    public boolean isSamePosition(FootballPlayer p){
        return position.equals(p.position);
    }
}
