package Syncthreadpractise;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Synceg {

	static	class printing{
		synchronized	void print(char ch) {
			for(int i=1;i<10;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
		
		static	class A extends Thread{
		
		printing p;
		public A(printing p) {
			this.p=p;
		}
		
		public void run() {
//			System.out.println("yea the threadA	is running");
			p.print('*');
		}
	}
	
		static	class B extends Thread{
		printing p;
		public B(printing p) {
			this.p=p;
		}
		
		public void run() {
//			System.out.println("yea thread B is running");
			p.print('#');
		}
	}
	
	public static void main(String[] args) {
		printing obj=new printing();
		A th1 =	new A(obj);
		B th2 = new B(obj);
		th2.setDaemon(true);
		th2.start();
		th1.start();
		
	}

}
