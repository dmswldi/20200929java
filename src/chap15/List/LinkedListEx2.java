package chap15.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1, 10); // [1]
		list.add(3,9);
		
		list.remove(1); // [1]
		
		for(int i : list) {
			System.out.println(i);
		}
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
		    System.out.println(iter.next());
		}
		
		
	}
}
