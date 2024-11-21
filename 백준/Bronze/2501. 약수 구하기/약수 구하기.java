import java.util.Scanner;

//2501 문제의 리팩토링 버전.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		int res = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
			if(count==k) {
				res=i; 
				break;
			}
		}
		System.out.println(res);
	}
}