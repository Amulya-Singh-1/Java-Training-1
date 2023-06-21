package com.java8.extras;

import java.util.Arrays;
import java.util.List;

public class EgParallerSort {

	public static void main(String[] args) {
		int[] arr=new int[] { 2,9 ,4,6,3,5, 0};
		Arrays.parallelSort(arr);
		System.out.println(List.of(arr));
//		for(int i:arr) { System.out.println(i); }

		
		int[] arr2= { 2,8,20, 90, 15, 45,21};
		Arrays.parallelSort(arr2, 2, 6);
//		System.out.println(Arrays.asList(arr2));
		List.of(arr2).stream().forEach( System.out::println );
		
//		for(int i:arr2) { System.out.println(i); }
	}

}
