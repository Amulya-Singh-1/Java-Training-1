package com.java8.lambda;

@FunctionalInterface
interface AddInterface{
	int addEm(int a , int b);
}

public class EgReturnLambda {
	public static void main(String[] args) {
		AddInterface obj= (n1, n2)->{
//			System.out.println(n1+n2);
			return n1+n2;
		};
		int ans=obj.addEm(5, 4);
		System.out.println(ans);
	}
}
