
import java.io.*;



public class JSONAHWDO6 {
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("converted.xml")){
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)jsonParser.parser(reader);
		
		
		JSONObject root = (JSONObject) jsonObject.get("converted");
		JSONArray  lessons = (JSONArray) root.get("ora");
		
		System.out.println("Órarend 2025 tavasz :\n");
		
		for(int i=0; i<lessons.size; i++) {
			JSONObject lesson = (JSONObject) lessons.get(i);
			JSONObject time = (JSONObject) lessons.get("idopont");
			System.out.println("Tárgy:" + lesson.get("targy"));
			System.out.println("Időpont:" + time.get("nap")+""+time.get("tol")+"-"+time.get("ig"));
			System.out.println("Helyszin:"  +lesson.get("helyszin"));
			System.out,println("Oktaató"   + lessons.get("oktato"));
			Systeam.out.println("Szak:"+ lessons.get("szak")+ "\n");

		}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	}