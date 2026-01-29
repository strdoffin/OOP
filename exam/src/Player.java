/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_05
 */
public abstract class Player {

    private double cash;
    private double energyPoint;
    private char gender;
    private double healthPoint;
    private String name;
    private static int playerCount;
    private final String playerId;
    protected final static int MAX_PLAYERS = 5;

    public Player() {
        this("unknown", 10.0, 10.0, 100.0, "male");
    }

    public Player(String name, String gender) {
        this(name, 10.0, 10.0, 100.0, gender);
    }

    public Player(String name, double healthPoint, double energyPoint, double cash, String gender) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.energyPoint = energyPoint;
        this.cash = cash;
        switch (gender) {
            case "Female":
            case "female":
                this.gender = 'f';
                break;
            case "Male":
            case "male":
                this.gender = 'm';
                break;
            default:
                System.out.println("Incorrect Input Gender.");
                break;
        }
        Player.playerCount += 1;
        this.playerId = this.name + "-" + Player.playerCount;
    }

    public double getCash() {
        return cash;
    }

    public double getEnergyPoint() {
        return energyPoint;
    }

    public String getGender() {
        if (this.gender == 'f') {
            return "female";
        }
        return "male";
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public static int getMAX_PLAYERS() {
        return Player.MAX_PLAYERS;
    }

    public String getName() {
        return name;
    }

    public static int getPlayerCount() {
        return Player.playerCount;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public void setCash(double cash) {
        if (cash >= 0) {
            this.cash = cash;
        } 
        else {
            System.out.println("Incorrect Input Cash.");
        }
    }

    public void setEnergyPoint(double energyPoint) {
        if (energyPoint >= 0) {
            this.energyPoint = energyPoint;
        } 
        else {
            System.out.println("Incorrect Input Energy Point.");
        }
    }

    public void setGender(String gender) {
        switch (gender) {
            case "Female":
            case "female":
                this.gender = 'f';
                break;
            case "Male":
            case "male":
                this.gender = 'm';
                break;
            default:
                System.out.println("Incorrect Input Gender.");
                break;
        }
    }

    public void setHealthPoint(double healthPoint) {
        if (healthPoint >= 0) {
            this.healthPoint = healthPoint;
        } 
        else {
            System.out.println("Incorrect Input Health Point.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drink(Eatable e) {
        if (e instanceof BluePotion){
            e.eat(this);
            System.out.println(this.getName()+" has the energy point medicine at "+ this.getEnergyPoint()+".");
        }
        else if (e instanceof HiPotion){
            e.eat(this);
            System.out.println(this.getName()+" has the high health point medicine at "+ this.getHealthPoint()+".");
        }
        else if (e instanceof RedPotion){
            e.eat(this);
            System.out.println(this.getName()+" has the health point medicine at "+ this.getHealthPoint()+".");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.playerId.equals(((Player) obj).getPlayerId());
    }
    public boolean equals(Player obj) {
        return this.playerId.equals( obj.getPlayerId());
    }

    @Override
    public String toString() {
        return ("name="+this.getName()+", healthPoint="+this.getHealthPoint()+", energyPoint="+this.getEnergyPoint()+", cash="+this.getCash()+", playerCount="+Player.getPlayerCount()+", MAX_PLAYERS="+Player.getMAX_PLAYERS()+", gender="+this.getGender()+", playerId="+this.getPlayerId()+".");
    }

}
