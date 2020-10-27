package chap15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionEx {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		
		for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
		    Integer integer = iterator.next();
		    // integers.remove(1);// ConcurrentModificationException -> 이거 하고 next() 다시 하는 게 안 되네
		    
		    // 방법 1 : 조건문 이용해서 iterator로 지우기
		    if(integer == 2) {
		        iterator.remove();
		    }
	
		
		}
		
		
		// 방법 2 : 삭제용 리스트 만들어서 removeAll -> 비추,,
	    /* List<Integer> toRemove = new ArrayList();
	    
	    for (Integer i : integers) {
	        if(i == 2) {
	            toRemove.add(i);
	        }
	    }
	    integers.removeAll(toRemove);*/
	     
	    
	    // 방법 3 : removeIf()
	    //integers.removeIf(i -> i == 2);
	    
		
		
		for(Integer i : integers) {
			System.out.println(i);
		}
		
		
		
	}
}
