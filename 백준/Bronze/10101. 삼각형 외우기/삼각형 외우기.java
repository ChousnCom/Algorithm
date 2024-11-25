import java.util.Scanner;
//세 각의 크기의 합이 180 && 두 각의 크기가 같으면 == Isosceles
//세 각의 크기가 모두 60인 경우 == Equilateral
//세 각의 크기의 합이 180 && 같은 각이 없으면 == Scalene
//세 각의 크기가 180이 아닌 경우 == Error

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		int res = ang1+ang2+ang3;
		if(ang1==60 && ang2==60 && ang3==60) {
			System.out.println("Equilateral");
		}else if(res==180 &&(ang1==ang2 || ang2==ang3 || ang3==ang1)) {
			System.out.println("Isosceles");
		}else if(res==180) {
			System.out.println("Scalene");
		}else {
			System.out.println("Error");
		}
	}
}
