package chap15.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		// 원래의 TreeSet은 순서 변경되지 않음!!!!! 오름차순 정렬되어 있음!!! 
		NavigableSet<Integer> descendingSet = scores.descendingSet();// 내림차순 정렬
		for(Integer score : descendingSet) {
			System.out.print(score + " ");// 전체 프린트
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();// 오름차순 정렬 -> 
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
		
		
		System.out.print("\nscores TreeSet: ");
		descendingSet = descendingSet.descendingSet(); 
		for(Integer score : scores) {
			System.out.print(score + " ");
		}
		
	}
}
