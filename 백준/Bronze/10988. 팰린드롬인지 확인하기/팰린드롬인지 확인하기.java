
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int isPalindrome = 1;
		for(int i = 0; i<st.length()/2; i++) {
			if(st.charAt(i)!=st.charAt(st.length()-1-i)) {
				isPalindrome=0;
			}
		}
		System.out.println(isPalindrome);
	}
}
