import java.util.Scanner;
//세 변의 길이가 모두 같은 경우 == Equilateral
//두 변의 길이만 같은 경우 == Isosceles
//세 변의 길이가 모두 다른 경우 == Scalene.
//삼각형의 조건을 만족 못하는 경우 == Invalid.
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a==b && b==c) { //세 변의 길이가 모두 같다aus
				if(a==0) { //세 변의 길이가 모두  0이라면 
					break; //stop
				}
				System.out.println("Equilateral"); // 0이 아닌 모두 같은 값일 때.
			}else if(a+b<=c || a+c<=b || b+c<=a) { // 삼각형의 조건을 만족하지 못할 경우
				System.out.println("Invalid");
			}else if(a!=b && b!=c && c!=a) {// 세 변의 길이가 모두 다른 경우
 				System.out.println("Scalene");
			}else { // 그 외 적어도 두 변 길이가 같을 경우.
				System.out.println("Isosceles");
			}
			
		}
	}
}
