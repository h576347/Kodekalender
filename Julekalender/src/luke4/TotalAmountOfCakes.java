package luke4;

import java.util.HashMap;

public class TotalAmountOfCakes {
	private final String MELK = "melk";
	private final String MEL = "mel";
	private final String SUKKER = "sukker";
	private final String EGG = "egg";
	
	public void totalCakes (HashMap<String,Integer> hm) {
		int cakes = 0;
		
		
		int mel = hm.get(MEL);
		int melk = hm.get(MELK);
		int sukker = hm.get(SUKKER);
		int egg = hm.get(EGG);
		
		
		while(mel > 2 && melk > 2 && sukker > 1 && egg > 0) {
			
			mel = mel-3;
			melk = melk-3;
			egg = egg-1;
			sukker = sukker-2;
			cakes ++;
			
		}
		
		
		System.out.println("Total amount of cakes: " + cakes);
	}

}
