package com.java8.extras;

import java.util.ArrayList;
import java.util.List;

public class EgForEachOrdered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");

//		gamesList.stream().forEach(System.out::println);
//		System.out.println();
//		System.out.println(" with forEachOrdered() method : ");
//		gamesList.stream().forEachOrdered(System.out::println);
		List<String> list = gamesList.stream().map(e -> e + "x").toList();
//		System.out.println(list);
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6);

		l.stream().map(i -> (i % 2 == 0 ? i + 2 : i)).forEach(System.out::println);
	}

}
