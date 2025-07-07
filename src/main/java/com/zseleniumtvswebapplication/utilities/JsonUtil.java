package com.zseleniumtvswebapplication.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil 
{
	static ObjectMapper objectMapper;
	
	public static JsonNode getDataFromJson(String fileName, String arrayName , String key, String value)
	{
		
		
		
		try 
		{
			objectMapper = new ObjectMapper();
			FileInputStream fileInputStream = new FileInputStream(fileName);
			JsonNode rootNode = objectMapper.readTree(fileInputStream);
			for(JsonNode node: rootNode.get(arrayName))
			{
				
				if(node.get(key).asText().equals(value))
				{
					return node;
					
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		
	
	public static JsonNode getUserDataFromUsers(String userDetails)
	{
		return getDataFromJson("src/main/resources/testdata/json/testride.json","Users" ,"UserDetails", userDetails);
		
	}

}
