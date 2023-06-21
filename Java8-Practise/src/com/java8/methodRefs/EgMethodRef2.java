package com.java8.methodRefs;

import java.util.Arrays;
import java.util.List;

public class EgMethodRef2 {
	
	void say(Integer i) {
		System.out.println("say to : " + i);
	}
	
	public static void main(String[] args) {
		List<Integer> list2=Arrays.asList(2, 4,6,8,22,44);
		
		list2.forEach( new EgMethodRef2()::say );
		
	}
}
