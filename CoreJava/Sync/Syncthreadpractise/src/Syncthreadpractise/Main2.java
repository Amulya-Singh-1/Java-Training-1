package Syncthreadpractise;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 1, 3, 2 };
		Arrays.sort(arr);

//		for (int i : arr) {
//			System.out.println(i);
//		}
//		/System.out.println(arr.toString());

		// Student2 student2 = new Student2();
		Student2[] student2 = new Student2[4];

		student2[0] = new Student2(1, "Amulya");
		student2[1] = new Student2(9, "Nitesh");
		student2[2] = new Student2(2, "Avar");
		student2[3] = new Student2(1, "Avar");

//		Arrays.sort(student2);

		Arrays.sort(student2, Student2.com);
//		System.out.println(student2.toString());
		// student2[0] = new Student2(1, "Amulya");

		for (Student2 student22 : student2) {
			System.out.println(student22);
		}
//		System.out.println(Arrays.toString(student2));
	}
}
