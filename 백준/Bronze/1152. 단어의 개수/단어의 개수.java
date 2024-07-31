import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		StringTokenizer tk = new StringTokenizer(st," ");
		//StringTokenizer 자바에서 토큰 자르기 st문자열의 띄어쓰기의 개수를 countTokens함수로 반환
		
		System.out.println(tk.countTokens());
	}
}