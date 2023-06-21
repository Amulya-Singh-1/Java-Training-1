package com.java8.stream;

import java.util.*;

public class EgStream2 {
	 public static void main(String[] args) {
		 List<Integer> list1=Arrays.asList(2,4,6,8,10,15);
		 list1.stream().limit(2).forEach( i-> System.out.println(i));
		 
		 System.out.println();
		 
		 list1.stream().skip(2).forEach( i-> System.out.println(i));

	}
}
