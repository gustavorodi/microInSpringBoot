package com.projeto.microservicojava;

import java.util.ArrayList;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class Greeting {

    private long id;
    private String name;
    private String cache;
    
   // private ArrayList<String> listName, listCache = new ArrayList();
    static DataConfig data = new DataConfig();

    
   public JSONObject putInJson() {

	   JSONObject obj = new JSONObject();
	   obj.put("Name:", true);
	   obj.put("Cache", false);
	   
	   return obj;
    }

    public long getId() {
        return id;
    }

    public String getName() {
    	return this.name;
    }

    public String getCache() {
    	return this.cache;
    }
    
    public JSONObject getAll() {
    	return data.getJson();
    }
    
    public void saveJson() {
    	data.saveDados(getId(),getName(), getCache());
    }
        
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public void setCache(String cache) {
    	this.cache = cache;
    }}

