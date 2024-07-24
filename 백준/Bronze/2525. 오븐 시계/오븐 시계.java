import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
		int addMin = sc.nextInt();
		int res = minutes + addMin;
		
		if(res>=60){
			hour = hour+(res/60);
			if(hour >= 24) {
				hour = hour - 24;
			}
			res = res%60;
		}
		System.out.println(hour+" "+res);
		
	}
}