package luke6;

import java.util.List;
import java.util.stream.Collectors;

import hjelpeKlasser.ReadClass;
import hjelpeKlasser.SplitTheStrings;


public class Main {
	
		private static final String LIST = "godteri.txt";
		private static SplitTheStrings sts = new SplitTheStrings();
		private static ReadClass rd = new ReadClass();
		private static final int ELVES = 120;
		private static final int ALL_GIFTS = 10000;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String> ls = sts.splittedStrings(rd.readFile(LIST));
			
			List<Integer> iLs = makeListInteger(ls);
			countCandy(iLs);
			
//			for(int godis : iLs) {
//				System.out.println(godis);
//			}
			
		

		}
		
		private static List<Integer> makeListInteger(List<String> ls) {
			return ls.stream()
				.map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());

		}
		
		private static void countCandy(List<Integer> iLs) {
			int[] giftWith10 = new int[2000];
			int[] giftWith11 = new int[2000];
			int[] giftWith12 = new int[2000];
			int[] giftWith13 = new int[2000];
			int[] giftWith14 = new int[2000];
			int[] giftWith15 = new int[2000];
			
			int n0 = 0;
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int n4 = 0;
			int n5 = 0;
			
			int index = 0;
			
			for(int i = 0; i < iLs.size(); i++) {
				index = iLs.get(i);
				
				if(index == 10) {
					giftWith10[n0] = index;
					n0++;
				}
				else if(index == 11) {
					giftWith11[n1] = index;
					n1++;
				}
				else if(index == 12) {
					giftWith12[n2] = index;
					n2++;
					
				}
				else if(index == 13) {
					giftWith13[n3] = index;
					n3++;
				}
				else if(index == 14) {
					giftWith14[n4] = index;
					n4++;
				} 
				else {
					giftWith15[n5] = index;
					n5++;
					
				}
			}
			for(int gifts : giftWith10) {
				System.out.println(gifts);
			}
			
//			int totalCandies = iLs.stream()
//				.collect(Collectors.summingInt(Integer::intValue));
//			System.out.println(totalCandies);
//			
//			int candiesInGifts = totalCandies/ALL_GIFTS;
//			System.out.println(candiesInGifts);
			
			
			
		}
	

}
