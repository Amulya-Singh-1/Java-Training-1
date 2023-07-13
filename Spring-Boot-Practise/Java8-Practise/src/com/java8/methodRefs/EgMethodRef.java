package com.java8.methodRefs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface A {
	public void play();
}

public class EgMethodRef {
	
	static void printSomething(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		
		List<String> list1=Arrays.asList("Amulya", "Avar", "Rahul");
		
		Consumer<String> consumerObj=new Consumer<>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		System.out.println( " passing lambda : " );
		list1.forEach( i -> System.out.println(i));
		System.out.println();
		
		System.out.println("conusmer object : ");
		list1.forEach(consumerObj);
		System.out.println();
		
		System.out.println("using method references using double colon operator to call the method : ");
		list1.forEach( EgMethodRef::printSomething );

	}

}
