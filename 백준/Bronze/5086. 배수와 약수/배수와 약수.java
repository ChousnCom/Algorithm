import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prev = 0;
		int next = 0;
		while(true) {
			prev = sc.nextInt();
			next = sc.nextInt();
			if(prev == 0 && next == 0) {
				break;
			}
			if(next%prev == 0) {
				System.out.println("factor");
			}else if(prev%next == 0 && prev>next) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
	}
}
