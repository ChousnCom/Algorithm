import java.util.Scanner;
//2차원 배열로 풀기.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch[][] = new char[5][15]; //5줄씩 최대 15글자.
		String st = "";
		for(int i = 0; i<5; i++) {
			st = sc.next();
			for(int j = 0 ; j<st.length(); j++) {
				ch[i][j] = st.charAt(j);
				//System.out.print(ch[i][j]);
			}
		}
		for(int i = 0 ; i<15; i++) {
			for(int j = 0; j<5; j++) {
				if(ch[j][i]=='\0') {
					continue;
				}
				System.out.print(ch[j][i]);
			}
		}
	}
}