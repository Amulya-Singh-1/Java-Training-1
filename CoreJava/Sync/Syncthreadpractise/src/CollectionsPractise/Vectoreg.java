package CollectionsPractise;

import java.util.*;

public class Vectoreg {
	public static void main(String[] args) {
		Vector<Integer> vec =new Vector<>(4, 2);
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		System.out.println("size : " + vec.size());
		System.out.println("capacity : " + vec.capacity());
		System.out.println();
		vec.add(5);
		System.out.println("size : " + vec.size());
		System.out.println("capacity : " + vec.capacity());
		System.out.println();
		vec.add(6);
		System.out.println("size : " + vec.size());
		System.out.println("capacity : " + vec.capacity());
		System.out.println();
		vec.add(7);
		System.out.println("size : " + vec.size());
		System.out.println("capacity : " + vec.capacity());
		System.out.println();
		
		List<Integer> vec2=vec.subList(2, 5);
		System.out.println(vec2);
		
		if(vec.contains(3)) { System.out.println("yes");}
		else { System.out.println("n0"); }
		
		Object clonevec=vec.clone();
		System.out.println(clonevec);
//		vec2.clear();
		System.out.println( vec.elementAt(3) );
		vec.addAll(vec2);
		System.out.println(vec);
		Collections.replaceAll(vec, 4, 9);
		
//		vec2.set(2, 99);
//		System.out.println(vec.retainAll(vec2));
//		System.out.println(vec);
		
	}
}
