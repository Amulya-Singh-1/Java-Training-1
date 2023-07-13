package com.java8.lambda;

@FunctionalInterface
interface B{
	public void say();
}

//We can make objects of interfaces directly using anonymous classes.

public class EgAnonymousClass {
	public static void main(String[] args) {
		String str= " Donno ";
		B obj2=new B() {
			public void say() { System.out.println("I have to say something." + str); }
		};
		obj2.say();
	}

}
