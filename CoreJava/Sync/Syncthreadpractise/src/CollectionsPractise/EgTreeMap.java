package CollectionsPractise;

import java.util.*;
import java.util.Map.Entry;

public class EgTreeMap {
	public static void main(String[] args) {
		HashMap<Integer, String> tm=new HashMap<>();
//		TreeMap<Integer, String> tm=new TreeMap<>();
//		LinkedHashMap<Integer, String> tm=new LinkedHashMap<>();
		tm.put(1, "Dedication");
		tm.put(4, "Stamina");
		tm.put(2, "Discipline");
		tm.put(5, "Strength");
		tm.put(7, "Endurance");
		tm.put(3, "Consistency");
		tm.put(6, "Willpower");
		System.out.println(tm);
		int targetkey=5;
		String targetval="Strength";
		
		for(Entry<Integer, String> i : tm.entrySet()) {
//			if( targetkey == i.getKey() ) { 
//				System.out.println(" key : 5 ");
//			}
//			if(targetval.equals(i.getValue())) {
//				System.out.println(" value : Strength ");
//			}
			if(targetval.equals(i.getValue()))
			System.out.println( " the key for  the value " +  targetval + " is " + i.getKey() );
		}
	}
}
