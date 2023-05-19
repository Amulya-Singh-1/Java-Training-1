package CollectionsPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronizedarraylist {
	public static void main(String[] args) {
		List<Integer> arl = new ArrayList<>();
		arl.add(1);
		arl.add(2);
		arl.add(3);
		arl.add(4);
		Vector<Integer> vec4=new Vector<>(4,2);
		vec4.addAll(arl);
		
//		1st method :
		synchronized (arl) {
			Iterator it = arl.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
//		2nd method :
		CopyOnWriteArrayList<Integer> synarl=new CopyOnWriteArrayList<>();
		synarl.add(2);
		synarl.add(3);
		System.out.println("synchronized arraylist using copyonwritearraylist : " + synarl);
		
		vec4.retainAll(synarl);
		System.out.println("after retaining : " + vec4);
		
		
	}
}
