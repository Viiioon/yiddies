package com.wholelotta.yiddies.repository;

import com.wholelotta.yiddies.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepo extends JpaRepository<Player, Long> {

    void deletePlayerById(Long playerId);

    Player findEmployeeById(Long playerId);
}
