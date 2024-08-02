import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int count = 0;
		int sum = 0;
		for(int i = 0; i<st.length(); i++) {
			if(st.charAt(i)<='C') {
				count = 3;
			}else if(st.charAt(i)<='F') {
				count = 4;
			}else if(st.charAt(i)<='I') {
				count = 5;
			}else if(st.charAt(i)<='L') {
				count = 6;
			}else if(st.charAt(i)<='O') {
				count = 7;
			}else if(st.charAt(i)<='S') {
				count = 8;
			}else if(st.charAt(i)<='V') {
				count = 9;
			}else if(st.charAt(i)<='Z') {
				count = 10;
			}else if(st.charAt(i)<='1') {
				count = 2;
			}else if(st.charAt(i)<='0') {
				count = 11;
			}
			sum = sum+count;
		}
		System.out.print(sum);
	}

}