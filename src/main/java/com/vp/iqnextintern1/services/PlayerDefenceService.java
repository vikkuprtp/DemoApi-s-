package com.vp.iqnextintern1.services;
import com.vp.iqnextintern1.repositories.PlayerDefenceRepository;
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
    public List<Map<String,Object>> getOnlyPosition(int id){
        return new ArrayList<>(playerDefenceRepository.getOnlyPosition(id));
    }
    public List<Map<String,Object>> getOnlyTackles(int id){
        return new ArrayList<>(playerDefenceRepository.getOnlyTackles(id));
    }
    public List<Map<String,Object>> getOnlyTacklesWon(int id){
        return new ArrayList<>(playerDefenceRepository.getOnlyTacklesWon(id));
    }

}