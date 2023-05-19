package CollectionsPractise;

import java.io.*;

public class EgSerializableee {
	public static void main(String[] args) {
		String str = "Hello serializable class";
		try {
			FileOutputStream f =new FileOutputStream("f1.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.write(str.getBytes());
			obj.flush();
			obj.close();
			f.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
