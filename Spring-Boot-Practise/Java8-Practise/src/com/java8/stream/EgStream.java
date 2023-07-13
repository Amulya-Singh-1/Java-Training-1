package com.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class EgStream {

	public static void main(String[] args) {
		List<Integer> l1 = List.of(3, 6, 1, 2, 8, 1);
		List<Integer> l2 = Arrays.asList(4, 6, 9, 2, 4, 33, 5, 4);

		System.out.println("distinct elements : ");
		l1.stream().sorted().distinct().forEach(i -> System.out.println(i));

		System.out.println("count : " + l2.stream().count());

		System.out.println("any of the elements greater than 3 : " + l1.stream().anyMatch(i -> i > 3));

		System.out.println("all of the elements greater than 3 : " + l1.stream().allMatch(i -> i > 3));

		System.out.println();
		l2.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		List<Integer> l3 = List.of(5, 10, 15, 20, 30, 50, 44, 55);

		System.out.println();
		l3.stream().map(i -> i * 2).forEach(i -> System.out.println(i));

		System.out.println();
		l3.stream().filter(i -> i % 2 == 0).map(i -> i * 10).forEach(i -> System.out.println(i));
		
		int[] arr=new int[] {2,4,6,7,8,5 };
		IntSummaryStatistics summaryStatistics=Arrays.stream(arr).summaryStatistics();
	    System.out.println( summaryStatistics);
	    System.out.println( "get avg : " + summaryStatistics.getAverage() );
	    System.out.println( "get max :" + summaryStatistics.getMax() );
	    System.out.println( "get sum : " + summaryStatistics.getSum() );
	    System.out.println( "get min : " + summaryStatistics.getMin() ); 

	}

}
