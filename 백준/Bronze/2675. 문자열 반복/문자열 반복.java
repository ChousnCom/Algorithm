import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
			for(int i = 0; i<depth; i++) {
				int loopCount = sc.nextInt();
				String s = sc.next();
			for(int j = 0; j<s.length(); j++) {
				char p = s.charAt(j);
				for(int k = 0; k<loopCount; k++) {
					System.out.print(p);
				}
			}
			System.out.println();
		}
	}
}
