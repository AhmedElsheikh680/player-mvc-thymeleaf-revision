package com.pring.player.service;

import com.pring.player.model.Player;
import com.pring.player.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    public List<Player> getPlayers() {
        return playerRepo.findAll();
    }

    public Player addplayer(Player player) {
        return playerRepo.save(player);
    }

    public Player getPlayer(int id) {
        return playerRepo.findById(id).get();
    }

    public void deletePlayer(int id) {
        playerRepo.deleteById(id);
    }
}
