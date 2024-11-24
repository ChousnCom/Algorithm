import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 =sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int resx=0;
		int resy=0;
		if(x==x1) {
			resx=x2;
		}else if(x1==x2) {
			resx=x;
		}else if(x==x2) {
			resx=x1;
		}
		if(y==y1) {
			resy=y2;
		}else if(y==y2) {
			resy=y1;
		}else if(y1==y2) {
			resy=y;
		}
		System.out.print(resx+" "+resy);
	}
}
