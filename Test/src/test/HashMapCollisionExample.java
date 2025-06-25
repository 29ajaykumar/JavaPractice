package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Key {
	String name;

	Key(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 42;
	} // Force same hash

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Key && name.equals(((Key) obj).name);
	}
}

public class HashMapCollisionExample {
	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();
		map.put(new Key("A"), "Apple");
		map.put(new Key("B"), "Banana");
		for(Entry<Key, String> mp :map.entrySet()) {
			System.out.println(mp.getKey()+":"+mp.getValue());
		}

		System.out.println(map); // Both keys coexist despite same hashCode
	}
}
