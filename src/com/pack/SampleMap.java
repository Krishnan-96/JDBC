package com.pack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {
	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		m.put("Csk", 10);
		m.put("MI", 50);
		m.put("RCB", 75);
		m.put("PUN", 74);
		m.put("DD", 23);
		m.put("Csk", 44);
//		Collection<Integer> values = m.values();
//		System.out.println(values);
//		Set<String> keySet = m.keySet();
//		System.out.println(keySet);

//		Integer integer = m.get("PUN");
//		System.out.println(integer);
//		Integer integer2 = m.get("10");
//		System.out.println(integer2);
		Set<Entry<String, Integer>> entrySet = m.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry);
//			String key = entry.getKey();
//			System.out.println(key);
//			System.out.println(entry.getValue());
		}
		Integer integer = m.get("MI");
		System.out.println(integer);
//		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		int hashCode = iterator.hashCode();
//		System.out.println(hashCode);
	}
}
