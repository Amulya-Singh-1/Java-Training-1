package CollectionsPractise;

import java.io.*;

public class EgDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream f2=new FileInputStream("f1.txt");
			ObjectInputStream obj=new ObjectInputStream(f2);
			String str;
			str=(String) obj.readLine();
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
