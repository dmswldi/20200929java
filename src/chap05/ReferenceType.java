package chap05;

public class ReferenceType {
	public static void main(String[] args) { // 실행 중단 Ctrl+ F2
		String s = null;
		// if(s.isEmpty()) System.out.println("Empty"); // NullPointerException 발생
		if (s==null) System.out.println("Null");
		else System.out.println("Not Null");
		
		int[] nums = null;
		//nums[0] = 10; // NullPointerException 발생
		nums = new int[] {1, 2};
		System.out.println(nums.length);
				
/*		// 배열 표현 1
		int var, array[];
		// ==
		int var;
		int[] array;
		
		// 배열 표현 2
		int[] array1, array2[];
		// ==
		int[] array1;
		int[][] array2;	*/
		
		String hobby = "여행";
		hobby = null; // null 처리로 JVM->GC가 heap에서 객체 제거하게 함 **null처리로 힙 비울 것!!
		
		try {
			int[] arr = null;
			System.out.println(arr.length);
		} catch(NullPointerException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		
	}
}
