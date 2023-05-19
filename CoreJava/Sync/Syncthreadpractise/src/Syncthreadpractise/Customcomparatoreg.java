package Syncthreadpractise;

import java.util.*;

public class Customcomparatoreg {
	
	static class Student{
		int age;
		String name;
		public Student(int age, String name) {
			this.age=age;
			this.name=name;
		}
	}
	
	static class CustomComp implements Comparator<Student>{
		public int compare(Student s1, Student s2) {
//			return s1.age - s2.age; // asc
			return s2.age - s1.age; // desc
//			return s1.name.compareTo(s2.name); 
//			return s1.age!=s2.age ? (s1.age - s2.age) : (s1.name).compareTo(s2.name);
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no. of entries of student type");
		int n=sc.nextInt();
		Student[] arr=new Student[n];
		System.out.println("Enter age and name of students and press enter after each entry");
		for(int i=0;i<n;i++) {
			int tempage=sc.nextInt();
			String tempname = sc.nextLine();
			arr[i]=new Student(tempage, tempname);
		}
		sc.close();
		Arrays.sort( arr, new CustomComp() );
		
//		for(Student i:arr) { System.out.println(i.age +" " + i.name); }
		
//		for (Student student : arr) {
//			System.out.println(student);
//		}
		System.out.println( Arrays.toString(arr) );
	}

}
