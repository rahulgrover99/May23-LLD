package models;

public class Player {
    private String name;
    private char symbol;
    private int id;
    private PlayerType playerType;

    // TODO(rahul): Add a method to make a move.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }



    public Player(String name, char symbol, int id, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.id = id;
        this.playerType = playerType;
    }


}
