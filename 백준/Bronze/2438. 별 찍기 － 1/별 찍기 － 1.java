import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		for(int i = 0; i<depth; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
	}
}
