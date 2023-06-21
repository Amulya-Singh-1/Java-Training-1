package com.java8.lambda;

public class EgLambdaInThreads {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("thread 1 is running.");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		
		//threads created using lambda
		Runnable r2=()->{
			System.out.println("thread 2 is running");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}

}
