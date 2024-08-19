import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char ch[] = new char[26]; // a~z까지 총 26칸 배열 생성
		for(int i = 0; i<st.length(); i++) { //
			if(st.charAt(i)>='A' && st.charAt(i)<='Z'){ //
				ch[st.charAt(i)-'A']++;
			}else {
				ch[st.charAt(i)-'a']++;
			}
		}
		int max = -1;
		char chr = '?';
		for(int i = 0; i<26; i++) {
			if(ch[i]>max) {
				max=ch[i];
				chr = (char)(i+65);
			}else if(ch[i]==max) {
				chr='?';
			}
		}
		System.out.print(chr);
	}
}