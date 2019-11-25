package com.projeto.microservicojava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

@RestController
public class MicroservicojavaController {
	 
    private final AtomicLong counter = new AtomicLong();
    Greeting greeting = new Greeting();

    
//    ,name,cache
    
    @RequestMapping("/greeting")
    public String geting() throws IOException {
    	  
    	return greeting.getAll();
    }
    
    @RequestMapping("/posting")
    public String postJson(String name, String cache) {
        greeting.setId(counter.incrementAndGet());
        greeting.setName(name);
        greeting.setCache("R$"+cache+".00");
        greeting.saveJson();
        
        return "salvou";
    	
    }

}
