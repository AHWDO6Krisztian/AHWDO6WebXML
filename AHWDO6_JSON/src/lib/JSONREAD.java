package lib;

import java.io.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JSONREAD {
	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)jsonParser.parser(reader);
		
		
	}
}
