package JDBC_Practise;

import java.io.*;
import java.util.*;

public class Practical_fileIO {

	public static void main(String[] args) {
		File f = new File("task.txt");
		File firstfile = new File("firstname.txt");
		File lastfile = new File("lastname.txt");
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of entries required in file");
		int n = sc.nextInt();
//		FileOutputStream fos , firststream, laststream;
		try (BufferedWriter fos = new BufferedWriter(new FileWriter(f));
				BufferedWriter firststream = new BufferedWriter(new FileWriter(firstfile));
				BufferedWriter laststream = new BufferedWriter(new FileWriter(lastfile));
				BufferedReader bfr = new BufferedReader(new FileReader(f)) ) {

			System.out.println("Now give full name of " + n + " people and hit enter after each entry");
			for (int i = 0; i < n; i++) {
				String temp = br.readLine();
				fos.write(temp);
				fos.newLine();
//				fos.write('\n');
			}
//			fos.close();
//			InputStreamReader r=new InputStreamReader(System.in);
			String str;
			while ((str = bfr.readLine()) != null) {
				String[] arr = str.split(" ");
				String fn = "", ln = "";
				if (arr.length == 2) {
					fn = arr[0];
					ln = arr[1];
				} else if (arr.length == 1) {
					fn = arr[0];
				} else {
					continue;
				}
				firststream.write(fn);
				firststream.newLine();
				laststream.write(ln);
				laststream.newLine();
//				laststream.write('\n');
			}
			System.out.println("yea , the task is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
//			fos.close();
//			firststream.close();
//			laststream.close();
		}
	}

}
