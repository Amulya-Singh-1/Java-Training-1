package com.java8.Optional;

import java.util.*;
public class EgOptional2 {

	public static void main(String[] args) {
		List<Integer> arl= new ArrayList<>();
		arl.add(4);
		arl.add(6);
		arl.add(8);
		arl.add(33);
		arl.add(12);
		Optional<List<Integer>> obj= Optional.ofNullable(arl);
		Optional<Integer> obj2=Optional.ofNullable(5);
		obj2.map( i -> i+1).ifPresent(System.out::println);
//		obj.map( i -> i+1 ).filter( j-> j%2==0 );
	}

}
