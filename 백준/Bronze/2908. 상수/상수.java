//구현 해야 할것
// 1. 문자열 정수 뒤집기
// 2. 뒤집힌 값 비교
// 3. 더 작은값 출력하게
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		char p1[] = new char[3];
		char p2[] = new char[3];
		int n = 0;
		for(int i = 2; i>=0; i--) {
			p1[i] = s1.charAt(n);
			p2[i] = s2.charAt(n);
			n++;
		}
		String str1 = new String(p1);
		String str2 = new String(p2);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if(num1>num2) {
			System.out.print(num1);
		}else {
			System.out.print(num2);
		}
		
	}
	//1. char배열 2개 선언해서 
	//2. for문을 역으로 선언해서 값이 뒤집히게 출력.
	// *이때 charAt(i)를 하지 않고 따로 n을 하는 이유는 
	// -> i가 역으로 시작하는데 그러면 값이 역으로 들어감 -> 값이 뒤집히지 않고 본래값을 출력하게 됨.
	//3. String객체 생성 -> new연산자를 사용하여 char 배열을 문자열화 시킴
	//4. parseInt를 통해 string -> integer형태로 변환
	//5. int로 형변환된 값을 비교하여 출력하기.
	
}