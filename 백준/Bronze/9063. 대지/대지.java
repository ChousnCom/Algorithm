import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int x[] = new int[depth];
		int y[] = new int[depth];
		for(int i = 0; i<depth; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		Arrays.sort(x); 
		Arrays.sort(y);
		int res=(x[depth-1]-x[0])*(y[depth-1]-y[0]);
		System.out.println(res);
	}	
}
