package chap15.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {// 맨 뒤 추가, 삭제 & 검색 해보기
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		// ArrayList 성능
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: " + (endTime-startTime) + "ns");
		
		// LinkedList 성능
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime-startTime) + "ns");
		
		
		// 추가 공부
		// ArrayList
		System.out.println("-------");
		List<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(6);
		startTime = System.nanoTime();
		al.add(9);
		endTime = System.nanoTime();
		System.out.println("ArrayList 끝에 추가: " + (endTime-startTime) + "ns" );
		
		al.set(2, 10);
		System.out.println(al);
		startTime = System.nanoTime();
		System.out.println(al.remove(al.size()-1));
		endTime = System.nanoTime();
		System.out.println("ArrayList 끝에 삭제: " + (endTime-startTime) + "ns" );
		al.add(null);
		System.out.println(al);
		
		// LinkedList
		System.out.println("-------");
		List<Integer> ll = new LinkedList<>();
		ll.add(3);
		ll.add(6);
		startTime = System.nanoTime();
		ll.add(9);
		endTime = System.nanoTime();
		System.out.println("LinkedList 끝에 추가: " + (endTime-startTime) + "ns" );
		
		ll.set(2, 10);
		System.out.println(ll);
		startTime = System.nanoTime();
		System.out.println(ll.remove(ll.size()-1));
		endTime = System.nanoTime();
		System.out.println("LinkedList 끝에 삭제: " + (endTime-startTime) + "ns" );
		ll.add(null);
		System.out.println(ll);
		
	}
}
