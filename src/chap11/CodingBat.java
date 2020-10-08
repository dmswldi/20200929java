package chap11;

public class CodingBat {
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 3, 1};
		String n = "";
		  for(int i = 0; i < nums.length; i++){
		    n += nums[i];
		  }
		System.out.println(n);
		
		// stringMatch("xxcaazz", "xxbaaz");
		// stringMatch("aabbccdd", "abbbxxd");
		stringMatch("iaxxai", "aaxxaaxx"); // expected 3 -> 중복 제거
		
		
		stringMatch2("xxcaazz", "xxbaaz");
		stringMatch2("aabbccdd", "abbbxxd");
		stringMatch2("iaxxai", "aaxxaaxx");
		
		
	}
	// how 1
	public static int stringMatch(String a, String b) {
		  int count = 0;
		  for(int i = 0; i < a.length()-1; i++){
		    for(int j = i; j < b.length()-1; j++){
		      if( a.substring(i,i+2).equals( b.substring(j,j+2) ) ) {
		        count++;
		        System.out.println(a.substring(i,i+2));
		        break; // 찾았으면 중복 안 생기게 break
		      }
		    }
		  }
		  return count;
	}
	
	// how 2
	public static int stringMatch2(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;
		
		for(int i = 0; i < len-1; i++) {
			if ( a.substring(i,i+2).equals(b.subSequence(i, i+2)) ) {
				count++;
				System.out.println(a.substring(i,i+2));
			}
		}
		  
		return count;
	}
}
