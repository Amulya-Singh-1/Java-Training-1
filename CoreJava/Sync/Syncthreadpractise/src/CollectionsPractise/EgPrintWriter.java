package CollectionsPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EgPrintWriter {
	public static void main(String[] args) {
		File f=new File("egPrintWriter2.txt");
//		1st method : 
		PrintWriter pw =new PrintWriter(System.out);
		pw.write("hehe i can print char or char array or string or int just at once. I am the most efficient writer here.");
		pw.flush();
		pw.close();
		
		
		try ( PrintWriter pw2=new PrintWriter(f); ){
			pw2.write("hehe i can print char or char array or string or int just at once. I am the most efficient writer here.");
			pw2.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
//		finally {
//			pw2.close();
//		}
		
	}
}
