package luke2;

import java.util.stream.IntStream;

public class ArrayPakke {

	private final static int BEFOLKNING = 5433000;

	public static void main(String[] args) {


		int pakk = levertePakker();
		System.out.println("Antall pakker: " + pakk);	
	}
	
	//Skal finne antall leverte pakker
	private static int levertePakker(){
		int pakker =0;
		
		for(Integer i = 0; i< BEFOLKNING; i++) {
			if(i.toString().contains("7")) {
				int prime = nermestePrime(i);
				i += prime;
			}else {
			pakker++;

		}
		
		}
		return pakker;
		
	}
		
	//Finner nærmeste primtall
	private static int nermestePrime(int s) {
		int b = s-1;
		
		if(!isPrime(s)) {
			while(!isPrime(b)) {
				b--;
			}
			return b;
		}
		else {
			return s;
		}
		
		

	}
	
	//Sjekkr om det er primtall
	static boolean isPrime(int number) {
        if(number <= 2)
            return number == 2;
        else
            return  (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                    .filter(n -> n % 2 != 0)
                    .noneMatch(n -> (number % n == 0));
    }}



