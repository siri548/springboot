package com.example.player.model;

public class Player {
    private int playerId;
    String playerName;
    int jerseyNumber;
    String role;

    Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public void setId(int playerId) {
        this.playerId = playerId;

    }

    public int getId() {
        return playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;

    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
