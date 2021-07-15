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
}
