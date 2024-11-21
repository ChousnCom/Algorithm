
	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			StringBuilder sb = new StringBuilder();
			int n = sc.nextInt();
			int x = sc.nextInt();
			while(n!=0) {
				if(n%x>=10) {
					sb.append((char)((n%x)+'A'-10)); 
				}else {
					sb.append(n%x);
				}
				n/=x;
			}
			System.out.println(sb.reverse().toString());
		}
	}
