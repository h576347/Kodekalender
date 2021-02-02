package luke4;

import java.util.HashMap;
import java.util.List;


public class Main {
	
	public static final String LIST = "leveringsliste.txt";
	//public static final String LIST = "prove.txt";
	
	public static final int MAX_CAKES = 5000;
	private static List<String> ingredients;
	private static HashMap<String,Integer> numberOfIngredients;
	
	private static ReadClass rd = new ReadClass();
	private static HandleIngredients hi = new HandleIngredients();
	private static TotalAmountOfCakes taoc = new TotalAmountOfCakes();
	private static SplitTheStrings sts = new SplitTheStrings();
	
	public static void main(String[] args) {

		ingredients = rd.readFile(LIST);
		
		List<String> splitted = sts.splittedStrings(ingredients);
		numberOfIngredients = hi.countIngredients(splitted);
		
		taoc.totalCakes(numberOfIngredients);
		

	}
	
	
}
