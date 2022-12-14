package com.vp.iqnextintern1.controllers;
import com.vp.iqnextintern1.exceptionhandler.GetResponsHandler;
import com.vp.iqnextintern1.services.PlayerStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("fifa/api/v1/statistic")
public class PlayerStatsController {
    @Autowired
    public PlayerStatisticService playerStatisticService;

    @GetMapping("/get-all-details")
    public ResponseEntity<Object> getAllPlayerStats(){
        try {
            List<Object> playerDetails = playerStatisticService.getAllPlayerStats();
            boolean bool = true;
            return GetResponsHandler.generateGetResponse("success", HttpStatus.OK,playerDetails,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateGetResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null,bool);

        }
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<Object> getPlayerById(@RequestParam Integer id){
        try{
            List<Map<String,Object>> getPlayerById= playerStatisticService.getPlayerStatisticById(id);
            boolean bool=true;
            return GetResponsHandler.generateCustomGetResponse("success",HttpStatus.OK,getPlayerById,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateCustomGetResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null,bool);
        }
    }
    @GetMapping("/apply-filter/no-of-goals")
    public ResponseEntity<Object> getOnlyNoOfGoals(@RequestParam Integer id){
        try{
            List<Map<String,Object>> getOnlyNoOfGoals=playerStatisticService.getOnlyNoOfGoals(id);
            boolean bool=true;
            return GetResponsHandler.generateCustomGetResponse("success",HttpStatus.OK,getOnlyNoOfGoals,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateCustomGetResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null,bool);
        }
    }
    @GetMapping("/apply-filter/only-by-DOB")
    public ResponseEntity<Object> getOnlyDOB(@RequestParam Integer id){
        try{
            List<Map<String,Object>> getOnlyDOB=playerStatisticService.getOnlyDOB(id);
            boolean bool=true;
            return GetResponsHandler.generateCustomGetResponse("success",HttpStatus.OK,getOnlyDOB,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateCustomGetResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null,bool);
        }
    }

    @GetMapping("/apply-filter/only-minutes-played")
    public ResponseEntity<Object> getOnlyMinutesPlayed(@RequestParam Integer id){
        try{
            List<Map<String,Object>> getOnlyMinutesPlayed=playerStatisticService.getOnlyMinutesPlayed(id);
            boolean bool=true;
            return GetResponsHandler.generateCustomGetResponse("success",HttpStatus.OK,getOnlyMinutesPlayed,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateCustomGetResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null,bool);
        }
    }



    
}
