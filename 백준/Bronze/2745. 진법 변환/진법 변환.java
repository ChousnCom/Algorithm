import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //수 입력
		int n = sc.nextInt(); // 진법 입력
		
		int tmp = 1;
		int sum  = 0; // 결과값
		for(int i=s.length()-1; i>=0; i--){ //진	법 변환은 왼쪽부터 수행되어야 함
			char ch = s.charAt(i);  
			if(ch>='A' && ch<='Z') { //진법이 알파벳이라면 A == 65 에서 55를 빼줌
				sum+=(ch-55)*tmp;
			}else {
				sum+=(ch-48)*tmp; //아스키 코드에서 0 == 48
			}
			tmp*=n;// 제곱
		}
		System.out.println(sum);
	}

}
