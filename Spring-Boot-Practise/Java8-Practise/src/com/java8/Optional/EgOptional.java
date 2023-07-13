package com.java8.Optional;

import java.util.Optional;

public class EgOptional {

	public static void main(String[] args) {
		String[] arr=new String[10];
		arr[4]="donoo";
		Optional<String> obj=Optional.ofNullable(arr[4]);
		if(obj.isPresent()){
			System.out.println(obj);			
		}
		else {
			System.out.println("empty : " + obj.isEmpty());
			System.out.println(obj.empty());
		}
		
		System.out.println(obj.get());
	}

}
