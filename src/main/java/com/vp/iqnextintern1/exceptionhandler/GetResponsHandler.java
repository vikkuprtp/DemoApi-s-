package com.vp.iqnextintern1.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetResponsHandler {

    public static ResponseEntity<Object> generateGetResponse(String message, HttpStatus status, List<Object> responseObject, boolean bool) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("HTTP status", status.value());
        map.put("data", responseObject);
        map.put("status", bool);
        return new ResponseEntity<>(map, status);
    }

//    public static ResponseEntity<Object> generateCustomGetResponse(String message, HttpStatus status, boolean bool) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("message", message);
//        map.put("HTTP status", status.value());
//        map.put("status", bool);
//        return new ResponseEntity<>(map, status);
//    }


    public static ResponseEntity<Object> generateCustomGetResponse(String message, HttpStatus status,List<Map<String,Object>> obj, boolean bool) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("data",obj);
        map.put("HTTP status", status.value());
        map.put("status", bool);
        return new ResponseEntity<>(map, status);
    }
}
