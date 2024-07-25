import java.util.Scanner;

public class Main {
	public int calcSum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main ac = new Main();
		int depth = sc.nextInt();
		
		int x = 0;
		int y = 0;
		int result = 0;
		for(int i = 0; i<depth; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			result = ac.calcSum(x,y);
			System.out.println(result);
		}
		
	}
}