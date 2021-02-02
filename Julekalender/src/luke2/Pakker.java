package luke2;

import java.util.ArrayList;
import java.util.Iterator;

public class Pakker {
	
//	static ArrayList<String> pakTab = new ArrayList<String>(10000);
	static String pakkeTabell[] = new String[10000];
	
	public static void main(String[] args) {
		leggInnPakker();
		//skrivUtPakker(pakkeTabell);
		String[] tab = levertePakker(pakkeTabell);
		skrivUtPakker(tab);
	}
	
	private static void skrivUtPakker(String[] pakkTab) {
		for(int i = 0; i<pakkTab.length; i++) {
			System.out.println(pakkTab[i]);
		}
	}
	
	private static void leggInnPakker() {
		for(int i = 0; i<pakkeTabell.length; i++) {
			pakkeTabell[i] = "" + i;
		}
		
	}
	
//	private static void leggInnPakker(ArrayList<String> pakTabell) {
//		Iterator i = pakTabell.iterator();
//	      while (i.hasNext()) {
//	         System.out.println(i.next());
//	      }
//		
//	}
//	
//	private static String[] levertePakker(String[] pakkTab) {
//		int prime = 0;
//		int kast = 0;
//		for(int i=0; i < pakkTab.length; i++) {
//			if(pakkTab[i].contains("7")) {
//				int count_o= 0;
//				int count_u = 0;
//				int o = Integer.parseInt(pakkTab[i]);
//				int u = Integer.parseInt(pakkTab[i]);
//				
//				
//				while((o+1)%2 == 0) {
//					o++;
//					count_o ++;
//				}
//				while((u-1)%2 == 0) {
//					u--;
//					count_u++;
//				}
//				if(count_u > count_o) {
//					prime = o;
//				}else {
//					prime = u;
//				}
//				
//				while(kast <= prime){
//					pakkTab[i] = ""+ prime + kast;
//					i++;
//					kast++;
//				}
//				
//				
//			}
//		}
//		return pakkTab;
//	}

	private static String[] levertePakker(String[] pakkTab) {
		int prime = 0;
		

		
		for(int i=0; i < pakkTab.length; i++) {
			if(pakkTab[i].contains("7")) {
				int count_o= 0;
				int count_u = 0;
				int o = Integer.parseInt(pakkTab[i])+1;
				int u = Integer.parseInt(pakkTab[i])-1;
				
				
				while((o%2) == 0) {
					o++;
					count_o ++;
				}
				while((u%2) == 0) {
					u--;
					count_u++;
				}
				if(count_u > count_o) {
					prime = o;
				}else {
					prime = u;
				}
				
				int kast = 0;
				for(int alle = i; alle < pakkTab.length; alle++) {
					if(kast < alle) {
						pakkTab[alle] = pakkTab[alle+kast];
					}else{
						pakkTab[alle] = pakkTab[alle+kast+1];
					}
					
					kast++;
				}
//				while(kast <= prime){
//					pakkTab[i] = ""+ (prime + kast);
//					i++;
//					kast++;
//				}
				
				
			}
		}
		return pakkTab;
	}

	


	
}
