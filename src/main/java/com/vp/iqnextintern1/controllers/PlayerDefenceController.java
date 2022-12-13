package com.vp.iqnextintern1.controllers;

import com.vp.iqnextintern1.exceptionhandler.GetResponsHandler;
import com.vp.iqnextintern1.services.PlayerDefenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("fifa/api/v1/defence")
public class PlayerDefenceController {
    @Autowired
    public PlayerDefenceService playerDefenceService;

    @GetMapping("/get-all-details")
    public ResponseEntity<Object> getAllPlayerDetails(){
        try {
            List<Object> playerDetails = playerDefenceService.getAllPlayerDefence();
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
            List<Map<String,Object>> getPlayerById= playerDefenceService.getPlayerDefenceById(id);
            boolean bool=true;
            return GetResponsHandler.generateCustomGetResponse("success",HttpStatus.OK,getPlayerById,bool);
        }catch(Exception e){
            boolean bool=false;
            return GetResponsHandler.generateCustomGetResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null,bool);
        }


    }
}
