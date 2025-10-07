package com.learningjava.bases;

import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(6);
		
		System.out.println(list.get(1));
		
		for(int value: list) {
			System.out.println(value);
		}
		
		list.forEach(System.out::println);
	}

}
