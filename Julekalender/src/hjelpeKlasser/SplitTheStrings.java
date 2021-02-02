package hjelpeKlasser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitTheStrings {
	
	public List<String> split(String str){
	    return Stream.of(str.split(","))
	      .map (elem -> new String(elem))
	      .collect(Collectors.toList());
	}
	
	public List<String> splittedStrings(List<String> ls){
		List<String> splitted = new ArrayList<String> (ls.size());
		for(int i = 0; i<ls.size(); i++) {
			splitted.addAll(split(ls.get(i)));
		}
		return splitted;
	}

}
