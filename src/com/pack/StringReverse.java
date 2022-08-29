package com.pack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringReverse {
	public static void main(String[] args) {

		String s = "GopalaKrishnan";

		// g=1,a=1

//		Map<Character, Integer> map = new LinkedHashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//
//			char c = s.charAt(i);
//			if (map.containsKey(c)) {
//
//				map.put(c, map.get(c) + 1);
//			} else {
//
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);

		String output = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			char c = s.charAt(i);
			output = output + c;
		}

		System.out.println(output);

	}
}
