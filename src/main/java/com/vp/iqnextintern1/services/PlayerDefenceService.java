package com.vp.iqnextintern1.services;

import com.vp.iqnextintern1.repositories.PlayerDefenceRepository;
import com.vp.iqnextintern1.repositories.PlayerStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PlayerDefenceService {
    @Autowired
    public PlayerDefenceRepository playerDefenceRepository;

    public List<Map<String,Object>> getPlayerDefenceById(int id) {
        return playerDefenceRepository.getPlayerDefenceById(id);
    }
    public List<Object> getAllPlayerDefence() {
        return new ArrayList<>(playerDefenceRepository.findAll());

    }
}