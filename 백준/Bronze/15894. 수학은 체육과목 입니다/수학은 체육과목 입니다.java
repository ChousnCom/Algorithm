import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long sum = 0;
		long count = 0; 
		long res=0;
		for(int i = 0; i<n; i++) {
			sum+=3;
			count++;
		}
		res = sum+count;
		System.out.println(res);
	}
}