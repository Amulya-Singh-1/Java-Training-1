package CollectionsPractise;

import java.util.LinkedList;
import java.util.Queue;

class EgLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		System.out.println("list2 :" + list2 );
		Object list3=list2.clone();
//		System.out.println(list3);
		list2.addFirst(0);
		list2.addLast(0);
		System.out.println("list2 :" + list2);
		Queue<Integer> q =new LinkedList<>();
		q.add(9);
		q.add(8);
		list2.addAll(q);
		System.out.println("list2 : " + list2);
		System.out.println("getfirst() : " + list2.getFirst());
		System.out.println("getlast() : " + list2.getLast());
		System.out.println("peek() : " + list2.peek());
		System.out.println("offer() : " + list2.offer(2));
		System.out.println("pop() : " + list2.pop());
		
	}
}
