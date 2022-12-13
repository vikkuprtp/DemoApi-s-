package com.vp.iqnextintern1.repositories;
import com.vp.iqnextintern1.models.PlayerDefence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface PlayerDefenceRepository extends JpaRepository<PlayerDefence,Integer> {
    @Query(value = "select * from player_defence where id=?1", nativeQuery = true)
    List<Map<String,Object>> getPlayerDefenceById(@Param("id") int id);
}
