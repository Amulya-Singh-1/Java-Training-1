package JDBC_Practise;

import java.util.ArrayList;
import java.util.List;

public class Eggenerics {
//	String T;
//	static List<T> bruhh()
	
//	public Eggenerics(String T){
//		this.T= T;
//	}
	
//	static List<T> custom2(T extends Number){
//		ArrayList<T> obj= new ArrayList<>();
//		obj.add(1);
//		obj.add(3);
//		return obj;
//	}
	private static double ans=0;
	
	static double sum(List<? extends Number> arr) {
		ans=0;
//		Scanner sc=sc.nextInt();
		return ans;	
	}
	
	 public static void main(String[] args) {
		List<Integer> arr2=new ArrayList<>();
		arr2.add(4);
		arr2.add(3);
		Eggenerics.sum(arr2);
		System.out.println(ans);
	}
}
