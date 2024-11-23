import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int res1 = 0;
		int res2 = 0;
		res1 = Math.min(x, w-x);
		res2 = Math.min(y, h-y);
		
		System.out.println(Math.min(res1,res2));
		
		
	}
}
