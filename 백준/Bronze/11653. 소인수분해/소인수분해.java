import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입려할 정수.
		int divisor = 2; //소인수 분해 2부터 시작하기때문에 divisor 값을 2로 초기화
		while(true) { //반복문
			if(n%divisor !=0) { // 만약 입력한 n 값이 divisor로 나누어 떨어지지 않는다면.
				divisor++; // divisor값을 1씩 증가.
			}else if(n%divisor == 0) { // 1씩 증가하다 n이 나누어 떨어진다면
				n/=divisor; // n을 divisor로 나누어 몫을 구하고
				System.out.println(divisor); //해당 연산을 수행한 divisor값을 출력
			}
			if(n<divisor) { //계속 나누다가 n이 divisor보다 값이 작게 되면 break;
 				break;
			}
		}
	}
}
