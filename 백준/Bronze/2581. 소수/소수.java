import java.util.Scanner;

public class Main {
	//소수 특 일의자리 ==> 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		int res = 0;
		int count = 0;
		
		for(int i = first; i<=last; i++) {
			int sum = 0;
			for(int j = 1; j<=last; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum%i == 1) {
				count++;
				res+=i;
			}
		}
		if(count!=0) {
			System.out.println(res);
		}else if(count == 0) {
			System.out.println(-1);
		}
		
		for(int i = first; i<=last; i++) {
			int sum = 0;
			for(int j = 1; j<=last; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum%i == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
