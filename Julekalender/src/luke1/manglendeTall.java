package luke1;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Collectors;


public class manglendeTall {
	
	private static final int MAXNUMB = 100000;
	private static List<Integer> tall = new ArrayList<Integer>(MAXNUMB);
	private static List<Integer> missingNum = new ArrayList<Integer>(MAXNUMB);
	
	public static void main(String[] args) {
		

		try {
			File myObj = new File("numbers.txt");
			Scanner myReader = new Scanner(myObj);
			
			while (myReader.hasNext()) {

				String data = myReader.nextLine();
				String[] token = data.split(",");
				for(int i = 0; i<token.length; i++) {
					tall.add(Integer.parseInt(token[i]));
				}

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		printMissingNumb(tall);
	}

	private static void printMissingNumb(List<Integer> tall) {
		//sorting the list
		List<Integer> sort = tall.stream()
				.sorted((s1,s2) -> s1.compareTo(s2))
				.collect(Collectors.toList());


		

		for (int j = 1; j < MAXNUMB; j++) 
			if (!sort.contains(j)) { 
				// Put missing numbers into missingNumbers 
				missingNum.add(j); 
			} 
		// Print missingNumbers 
		System.out.println("Missing number is : " + missingNum);
		
		//answer is 81273;

	}




}
