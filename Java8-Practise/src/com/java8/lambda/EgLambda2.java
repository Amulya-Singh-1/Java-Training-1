package com.java8.lambda;

@FunctionalInterface
interface Playable{
	String play();
}

public class EgLambda2 {
	public static void main(String[] args) {
//		// Anonymous class
//		Playable p=new Playable() {
//			public String play() {
//				System.out.println("Hii I am playing.");
//				return "Hii I am playing." ;
//			}
//		};
//		p.play();
		
		//using Lambda
		Playable p2=()->{
				System.out.println("Hii I am Playing");
				return "Hii I am Playing.";
		};
		p2.play();
	}
}
