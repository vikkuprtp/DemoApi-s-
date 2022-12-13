package com.vp.iqnextintern1.repositories;

import com.vp.iqnextintern1.models.PlayerDefence;
import com.vp.iqnextintern1.models.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface PlayerStatisticRepository extends JpaRepository<PlayerStats,Integer> {
    @Query(value = "select * from player_stats where id=?1", nativeQuery = true)
    List<Map<String,Object>> getPlayerStatisticById(@Param("id") int id);


}

