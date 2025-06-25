package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapInternalWorking {

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("A", 1);
		mp.put("B", 2);
		System.out.println(mp);
		Iterator<String> it = mp.keySet().iterator();
		while (it.hasNext()) {
		    if (it.next().equals("A")) {
		        it.remove();  // ✅ Safe
		    }
		}
		System.out.println(mp);


	}

}
