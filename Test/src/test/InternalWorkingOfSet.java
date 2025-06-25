package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InternalWorkingOfSet {

	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<>();
		String S1 = mp.put("A", "Ajay");
		String s2 = mp.put("B", "Shikha");
		S1 = mp.put("A", "Ajay"); 
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		System.out.println(mp);
		System.out.println(hs);

	}

}
