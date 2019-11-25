package com.projeto.microservicojava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import net.minidev.json.JSONObject;

public class DataConfig {
		JSONObject jsonObject = new JSONObject();

		private int fgStatus = 1;
	
	    public void saveDados(long id,String name, String email) {
	         
	        //Cria um Objeto JSON
	         
	        FileWriter writeFile = null;
	         
	        //Armazena dados em um Objeto JSON
	        jsonObject.put("id", "id");
	        jsonObject.put("name", "name");
	        jsonObject.put("email", "email");
	        
	        try{
	            writeFile = new FileWriter("./save.json",true);
	            //Escreve no arquivo conteudo do Objeto JSON
	            if(this.fgStatus == 1) {
		            writeFile.write(jsonObject.toJSONString());
		            writeFile.close();
		            this.fgStatus++;
	            } else {
		            writeFile.write(",\n"+jsonObject.toJSONString());
		            writeFile.close();

	            }
	        }
	        catch(IOException e){
	            e.printStackTrace();
	        }
		}
		
		public String getJson() throws IOException {
			
			String js = String.join(" ",
                    Files.readAllLines(
                            Paths.get("./save.json"),
                            StandardCharsets.UTF_8)
            );
			System.out.println(js);
			return js;
		}
}

