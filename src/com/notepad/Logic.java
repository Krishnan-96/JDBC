package com.notepad;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Logic {
	public static void main(String[] args) {
//		String s = "Automation Testing";
//
//		String[] d = s.split(" ");
//
//		List<String> li = new ArrayList<>();
//
//		for (String n : d) {
//			li.add(n);
//		}
//
//		for (String f : li) {
//			for (int i = f.length() - 1; i >= 0; i--) {
//				char c = f.charAt(i);
//				System.out.print(c);
//			}
//			System.out.print(" ");
//		}
		// ==========================================================================================
//		String str = "Gopala Krishnan";
//
//		char[] cs = str.toCharArray();
//
//		Map<Character, Integer> m = new LinkedHashMap<>();
//
//		for (char s : cs) {
//			if (m.containsKey(s)) {
//				Integer f = m.get(s);
//				m.put(s, f + 1);
//			} else {
//				m.put(s, 1);
//			}
//		}
//		Set<Entry<Character, Integer>> entry = m.entrySet();
//
//		for (Entry<Character, Integer> g : entry) {
//
//			if (g.getKey() == 'a') {
//				System.out.println(g.getKey() + "=" + g.getValue());
//			}
//		}
		// ==============================================================================================
		String str = "java class today";

		char[] ca = str.toCharArray();

		char maxKey = ' ';
		int maxValue = 0;

		Map<Character, Integer> m = new LinkedHashMap<>();

		for (char k : ca) {
			if (m.containsKey(k)) {
				Integer e = m.get(k);
				m.put(k, e + 1);
			} else {
				m.put(k, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = m.entrySet();

		for (Entry<Character, Integer> h : entrySet) {
			Integer value = h.getValue();
			if (value > maxValue) {
				maxKey = h.getKey();
				maxValue = h.getValue();
			}
		}
		
		System.out.println(maxKey + "="+maxValue);

	}
}
