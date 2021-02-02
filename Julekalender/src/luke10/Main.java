package luke10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import hjelpeKlasser.ReadClass;
import hjelpeKlasser.SplitTheStrings;

public class Main {
	public static final String LIST = "luke5test.txt";
	private static ReadClass rc = new ReadClass();
	private static SplitTheStrings sts = new SplitTheStrings();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = readURL();
//		List<String> splitted = sts.splittedStrings(ls);
		HashMap<String,Integer> active = deltagere(ls);
		
		active.entrySet().forEach( entry -> {
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		});
		
		System.out.println(active.entrySet().stream()
			.max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())));
		
		
	

	}
	
	private static List<String> readURL() {
		URL url;
		List<String> ls = new ArrayList<String>();
		try {
			
			String line = ""; 
			
			url = new URL("https://julekalender-backend.knowit.no/challenges/10/attachments/leker.txt");
			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line = bf.readLine()) != null) {
				ls.add(line);

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
		
	}
	
	private static HashMap<String, Integer> deltagere(List<String> names) {
		
		HashMap<String,Integer> hm = new HashMap();
		List<String> words;
		
		for(int i = 0; i <names.size(); i++) {
			words = sts.split(names.get(i));
			
			for(int j = 0; j < words.size(); j++) {
				int score = words.size();
				if(!hm.containsKey(words.get(j))) {
					hm.put(words.get(j), score-(j+1));
				}else {
					int value = score-(j+1);
					int preValue = hm.get(words.get(j));
					hm.replace(words.get(j), preValue + value);
					
				}
				
				
			}
			
		}
		return hm;
		
		
	}
	
	

	




}
