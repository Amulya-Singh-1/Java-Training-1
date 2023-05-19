package CollectionsPractise;

import java.util.TreeSet;

public class EgTreeset {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(-1);
		ts.add(2);
		ts.add(4);
		ts.add(6);
		ts.add(50);
		ts.remove(2);
		System.out.println(ts);
		System.out.println("higher than 4 : " + ts.higher(4));
		System.out.println("lower than 2 : " + ts.lower(4));
		System.out.println("headset of 4 : " + ts.headSet(4));
		System.out.println("tailset of 4 : " + ts.tailSet(4));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.isEmpty());
		System.out.println(ts.descendingSet());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}
}
