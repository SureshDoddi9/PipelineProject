package com.pipeline.local;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/testApi")
public class controller {

    @GetMapping("/getData")
    public Map<String,String> getData(){
        Map<String,String> data = new LinkedHashMap<>();
        data.put("name","test");
        data.put("age","23");
        data.put("address","Bangalore");
        data.put("profession","software Engineer");
        return data;
    }
}
