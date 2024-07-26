import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int result = 0;
		for(int i = 0; i<depth; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			result = x+y;
			System.out.println("Case #"+(i+1)+": "+result);
		}
	}
}
