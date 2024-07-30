
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		String st = sc.nextLine();
		if(st.length()-1==depth) {
			st = "\0";
		}
		for(int i = 0; i<st.length(); i++) {
			sum = sum+st.charAt(i)-48;
		}
		System.out.println(sum);
	}
}