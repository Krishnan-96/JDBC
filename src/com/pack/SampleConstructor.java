package com.pack;

public class SampleConstructor extends SampleConstructor1 {

	public SampleConstructor() {
		this(26);
		System.out.println("default Constructor");
	}

	public SampleConstructor(int a) {
		this("Krishnan");
		System.out.println("My age is :" + a);
	}

	public SampleConstructor(String name) {
		this(9915, "CBE");
		System.out.println("My Name is :" + name);
	}

	public SampleConstructor(int a, String address) {
		super(25.36f);
		System.out.println("Employee id is :" + a);
		System.out.println("Employee natuve is :" + address);
	}

	public static void main(String[] args) {
		SampleConstructor s = new SampleConstructor();
	}
}
