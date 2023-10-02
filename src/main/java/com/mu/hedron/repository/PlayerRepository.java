package com.mu.hedron.repository;

import com.mu.hedron.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    // Custom query methods can be defined here if needed
}
