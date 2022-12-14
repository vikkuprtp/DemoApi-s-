package com.vp.iqnextintern1.services;
import com.vp.iqnextintern1.repositories.PlayerStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class PlayerStatisticService {
    @Autowired
    public PlayerStatisticRepository playerStatisticRepository;

    public List<Map<String,Object>> getPlayerStatisticById(int id) {
        return playerStatisticRepository.getPlayerStatisticById(id);
    }
    public List<Object> getAllPlayerStats() {
        return new ArrayList<>(playerStatisticRepository.findAll());

    }
    public List<Map<String,Object>> getOnlyNoOfGoals(int id){
        return new ArrayList<>(playerStatisticRepository.getOnlyNoOfGoals(id));
    }
    public List<Map<String,Object>> getOnlyDOB(int id){
        return new ArrayList<>(playerStatisticRepository.getOnlyDOB(id));
    }
    public List<Map<String,Object>> getOnlyMinutesPlayed(int id){
        return new ArrayList<>(playerStatisticRepository.getOnlyMinutesPlayed(id));
    }
}
