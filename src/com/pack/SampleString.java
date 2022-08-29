package com.pack;

public class SampleString {
	public static void main(String[] args) {
		String s = new String("Gopala Krishnan");
		String s3 = new String("Kodai");
		String s1 = "Kodai";
		String s2 = "   gopala krishnan  ";

//		int length = s.length();
//		System.out.println(length);
//
//		boolean empty = s1.isEmpty();
//		System.out.println(empty);
//
//		char charAt = s.charAt(5);
//		System.out.println(charAt);

//		int indexOf = s.indexOf('k');
//		System.out.println(indexOf);

//		boolean contains = s.contains("k");
//		System.out.println(contains);
//
//		int lastIndexOf = s.lastIndexOf('a');
//		System.out.println(lastIndexOf);
//
//		String concat = s.concat(" " + s1);
//		System.out.println(concat);
		String concat2 = s.concat(s3);

		System.out.println(s.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(concat2.hashCode());
//
//		System.out.println(s);
//
//		String upperCase = s.toUpperCase();
//		System.out.println(upperCase);
//
//		boolean startsWith = s.startsWith("G");
//		System.out.println(startsWith);
//
//		boolean endsWith = s.endsWith("nan");
//		System.out.println(endsWith);
//
//		boolean equals = s.equals(s1);
//		System.out.println(equals);
//
//		boolean equals2 = s.equals(s2);
//		System.out.println(equals2);
//
//		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
//		System.out.println(equalsIgnoreCase);
//
//		String replace = s.replace("nan", "mwe");
//		System.out.println(replace);
//
//		String trim = s2.trim();
//		System.out.println(trim);
//
//		int indexOf = trim.indexOf('g');
//		System.out.println(indexOf);
//
//		String substring = s.substring(6, 15);
//		System.out.println(substring);
//

	}

}
