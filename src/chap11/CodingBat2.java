package chap11;

public class CodingBat2 {
	public static void main(String[] args) {
		// String-3 countYZ()
		String str = "fez day"; // "day yak"; // "DAY abc XYZ"; //"y2bz"; //"!!day--yaz!!"; // 
		
		// test
		int aa = str.charAt(0);
		char a = 'a'; char z = 'z';
		char A = 'A'; char Z = 'Z';
		System.out.println((int)a + ", " + (int)z);
		System.out.println((int)A + ", " + (int)Z);
		
		
		System.out.println();
		
		/* for(int i = 0; i < str.length(); i++){
		  if(str.charAt(i) >= '\u0041' && str.charAt(i) <= '\u005A'
		  || str.charAt(i) >= '\u0061' && str.charAt(i) <= '\u007A'){
		    System.out.print(str.charAt(i));
		   }
		} */
		  
		  
		  int count = 0;
		  
		  // how 1
		  /*for(int i = 0; i < str.length(); i++){
			  
			  if(str.charAt(i) >= 65 && str.charAt(i) <= 90
			  || str.charAt(i) >= 97 && str.charAt(i) <= 122) { // a-z, A-Z이면
				  if(i == str.length()-1 && (str.charAt(i) == 'y' || str.charAt(i) == 'Y' 
						  || str.charAt(i) == 'z' || str.charAt(i) == 'Z')) { // 마지막 문자일 때
					  count++;
					  System.out.println(i + ", " + str.charAt(i));
				  }
				  
			  } else if(i >= 1 && (str.charAt(i-1) == 'y' || str.charAt(i-1) == 'Y' 
					  || str.charAt(i-1) == 'z' || str.charAt(i-1) == 'Z')) { // 영문자가 아니고, 이전 char이 존재하고 y나 z야
						  count++;
						  System.out.println(i-1 + ", " + str.charAt(i-1));
				}
		  }*/
		  
		  
		  
		  // how2 : 더 깔끔한 코드
		  for(int i = 0; i < str.length(); i++){
			  if(str.charAt(i) == 'y' || str.charAt(i) == 'Y' 
						  || str.charAt(i) == 'z' || str.charAt(i) == 'Z') { // y나 z일 때
				  
				  if (i == str.length()-1) count++; // 마지막 문자면 ++
				  
				  else {
					  if (!(str.charAt(i+1) >= 65 && str.charAt(i+1) <= 90
							  || str.charAt(i+1) >= 97 && str.charAt(i+1) <= 122)) count++; // 다음 문자가 영문자가 아니면 ++
				  }
				  
			  }
			  
		  }
		  
		  // y나 z가 마지막 문자거나 || y나 z 다음 문자가 영문자가 아닐 떄
		  
			  
		 System.out.println("총: " + count);
		  
	}
}
