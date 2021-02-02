package luke4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadClass {


	public List<String> readFile(String list) {
		List<String> ls = new ArrayList<String>();
		FileReader myReader;
		try {
			myReader = new FileReader(new File(list));
		
		BufferedReader readBuffer = new BufferedReader (myReader); 
		
		
		String line = "";
		
		try {
			while((line = readBuffer.readLine()) != null) {
				ls.add(line);
				
				
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
