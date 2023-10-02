package com.mu.hedron.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int playerId;

    @Column(name = "name")
    private String playerName;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Player() {
    }

    // Constructor with parameters
    public Player(String playerName, BigDecimal balance) {
        this.playerName = playerName;
    }

    // Getter and Setter methods
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
