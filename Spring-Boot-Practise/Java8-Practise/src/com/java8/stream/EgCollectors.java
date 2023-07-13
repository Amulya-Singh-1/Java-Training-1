package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EgCollectors {

	public static void main(String[] args) {
		List<Character> l=List.of('a', 'b', 'c','d', 'a', 'c');
		System.out.println( l.stream().collect( Collectors.groupingBy( e -> e, Collectors.counting() )));
// @formatter:on


	}

}
