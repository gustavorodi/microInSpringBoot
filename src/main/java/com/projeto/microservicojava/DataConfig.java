package com.projeto.microservicojava;

import java.io.FileWriter;
import java.io.IOException;

import net.minidev.json.JSONObject;

public class DataConfig {
		JSONObject jsonObject = new JSONObject();
		private int fgStatus = 1;
	
	    public void saveDados(long id,String name, String cache) {
	         
	        //Cria um Objeto JSON
	         
	        FileWriter writeFile = null;
	         
	        //Armazena dados em um Objeto JSON
	        jsonObject.put("id", "id");
	        jsonObject.put("name", "name");
	        jsonObject.put("cache", "cache");
	        
	        try{
	            writeFile = new FileWriter("./save.json", true);
	            //Escreve no arquivo conteudo do Objeto JSON
	            if(this.fgStatus == 1) {
		            writeFile.append("[");
		            writeFile.write(jsonObject.toJSONString());
		            writeFile.append("]");
		            writeFile.close();
		            this.fgStatus++;
	            } else {
	            	writeFile.append(",[");
		            writeFile.write(jsonObject.toJSONString());
		            writeFile.append("]");
		            writeFile.close();
	            }
	            System.out.println("------------------heyyyyyyy");
	        }
	        catch(IOException e){
	        	System.out.println("++++++++++++++++++heyyyyyyy");
	            e.printStackTrace();
	        }
		}
		
		public JSONObject getJson() {
			
			return jsonObject;
		}
}
