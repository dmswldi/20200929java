package chap11;

public class CodingBat3 {
	public static String withoutString(String base, String remove) {
		// 비교할 때만 loerCase로 하고 원래 String값 건들면 X

		int l = base.toLowerCase().indexOf(remove.toLowerCase());// include

		if (l != -1 && remove != "") {
			base = base.substring(0, l) + base.substring(l + remove.length());
			System.out.println(base);
			base = withoutString(base, remove);
			
			int ll = base.indexOf("  ");
			if(ll  != -1){ // 공백 두 칸 존재
				base = base.substring(0, ll) + base.substring(ll+1);
			}
		}
		return base;
	}

	public static void main(String[] args) {
		System.out.println("결과: " + withoutString("This is a FISH", "IS"));
		System.out.println(withoutString("This is a FISH", "IS") == "Th a FH");

	}
}
