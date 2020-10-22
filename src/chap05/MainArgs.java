package chap05;

public class MainArgs {
	public static void main(String[] args) {
		if(args.length == 1) {
			System.out.println("cmd: java MainStringArrayArgument arg1 arg2 ...");
			System.exit(0);
		}
	}
}
