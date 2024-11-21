import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int n = 0;
		int count = 0;
		for(int i = 0; i<depth; i++) {
			int sum = 0;
			n = sc.nextInt();
			for(int j = 1; j<=n; j++) {
				if(n%j==0) {
					sum+=j;
				}
			}
			//System.out.println(sum);
			if(sum%n==1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
