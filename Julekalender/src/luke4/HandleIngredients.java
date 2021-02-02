package luke4;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleIngredients {
	private final String MELK = "melk";
	private final String MEL = "mel";
	private final String SUKKER = "sukker";
	private final String EGG = "egg";

	//Teller antall ingredienser
	public HashMap<String,Integer> countIngredients(List<String> ls) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>(ls.size());
		
		int mel = 0;
		int melk = 0;
		int sukker = 0;
		int egg = 0;
		
		//Bruker pattern og matcher
		Pattern p = Pattern.compile("\\d+");
        Matcher m; 
      
		
		for(int i = 0; i<ls.size(); i++) {

			String index = ls.get(i);
			
			if(index.contains(MEL) && !index.contains("k")) {   
				m = p.matcher(index);
				int mel1 = 0;
				
				while(m.find()) {
					mel1 = Integer.parseInt(m.group());
	
				}
				mel += mel1;
			}
			
			else if(index.contains(MELK)) {
				m = p.matcher(index);
				int melk1 = 0;
				
				while(m.find()) {
					melk1 = Integer.parseInt(m.group());
	
				}
				melk += melk1;
			}
			else if(index.contains(EGG)) {
				m = p.matcher(index);
				int egg1 = 0;
				while(m.find()) {
					egg1 = Integer.parseInt(m.group());
	
				}
				egg += egg1;
				
			}
			else if(index.contains(SUKKER)) {
				m = p.matcher(index);
				int sukker1 = 0;
				
				while(m.find()) {
					sukker1 = Integer.parseInt(m.group());
	
				}
				sukker += sukker1;
				
			}else {
				m = p.matcher(index);
				int melk1 = 0;
				
				while(m.find()) {
					melk1 = Integer.parseInt(m.group());
	
				}
				melk += melk1;
				
			}

		
		}
		//Legger til ingrediensene og antall ingredienser i en hashmap
		hm.put(MEL, mel);
		hm.put(MELK, melk);
		hm.put(EGG, egg);
		hm.put(SUKKER, sukker);
		
		return hm;
	}
	
	

}
