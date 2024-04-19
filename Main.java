package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Integer> lst = List.of(12, 34, 43, 45, 3);

		List<Integer> lt1 = lst.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		 
		System.out.println(lt1);
	}
}
