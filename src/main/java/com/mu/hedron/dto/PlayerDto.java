package com.mu.hedron.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerDto {
    private String name;

    public PlayerDto(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
}
