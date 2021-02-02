package luke5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static final String LIST = "luke5test.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = readFile(LIST);
		
		for(String Thomas : ls) {
			System.out.println(Thomas);
		}
		
	

	}
	
	public static void filterHAndO(List<String> ls) {
		
	}
	
	
	public static List<String> split(String str){
	    return Stream.of(str.split(""))
	      .map (elem -> new String(elem))
	      .collect(Collectors.toList());
	}
	
	public static List<String> splittedStrings(List<String> ls){
		List<String> splitted = new ArrayList<String> (ls.size());
		for(int i = 0; i<ls.size(); i++) {
			splitted.addAll(split(ls.get(i)));
		}
		return splitted;
	}
	
	private static List<String> readFile(String list) {
		List<String> ls = new ArrayList<String>();
		FileReader myReader;
		try {
			myReader = new FileReader(new File(list));
		
		BufferedReader readBuffer = new BufferedReader (myReader); 
		
		
		String line = "";
		
		try {
			while((line = readBuffer.readLine()) != null) {
				ls = split(line);
				
				
			}
			readBuffer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
		
	}
	

}
