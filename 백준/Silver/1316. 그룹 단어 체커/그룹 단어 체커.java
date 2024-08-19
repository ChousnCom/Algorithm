import java.util.Scanner;

//기존에 나왔던 단어는 배제
// ex. aabba -> x
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static boolean check() {
		boolean check[]= new boolean[26];
		String s = sc.next();
		int prev = 0;
		for(int i = 0; i<s.length(); i++) {
			int now = s.charAt(i);
			
			if(prev!=now) { //이전의 문자값이 i번째 문자와 같지 않다면?
				
				 if(check[now-'a']==false) { //해당 문자가 처음 나오는 경우
					 check[now-'a'] = true;
					 prev = now; // 다음 번째를 위해 prev를 now로 바꿔줌
				 }else {
					 return false;
				 }
				
			}else {
				continue;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int depth=sc.nextInt();
		String s = "";
		int count = 0;
		for(int i = 0; i<depth; i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
