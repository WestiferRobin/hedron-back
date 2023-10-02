package com.mu.hedron.componet;
import com.mu.hedron.dto.PlayerDto;
import com.mu.hedron.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerConverter {

    public static PlayerDto playerToPlayerDto(Player player) {
        return new PlayerDto(player.getPlayerName());
    }

    public static Player playerDtoToPlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setPlayerName(playerDto.getName());
        // Add any additional mapping logic here
        return player;
    }
}

