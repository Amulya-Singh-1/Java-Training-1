package com.java8.lambda;
import java.util.*;

@FunctionalInterface
interface A{
	void listen(int port);
}

public class EgLambda{

	public static void main(String[] args) {
		A obj=(port)->{
			System.out.println("yes, listening to requests on port : " + port);
		};
		
		obj.listen(8080);
		
		System.out.println();
		
		//lambda in for-Each
		List<String> nameStrings= new ArrayList<String>();  
        nameStrings.add("ankit");  
        nameStrings.add("mayank");  
        nameStrings.add("irfan");  
        nameStrings.add("jai");  
        
        nameStrings.forEach(n->System.out.println(n));
        

	}	
//	@Override
//	public void listen(int port) {
//		// TODO Auto-generated method stub
//		
//	}
}
