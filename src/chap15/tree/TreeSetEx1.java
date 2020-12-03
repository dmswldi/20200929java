package chap15.tree;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();// binary tree 구조의 set
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();// 제일 낮은 Integer
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();// 가장 낮은 것 하나 빼고
			System.out.println(score + " (남은 객체 수: " + scores.size() + ")");
		}
		
		
	}
}
