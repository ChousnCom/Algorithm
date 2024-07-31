import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int arr[] = new int[26];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			//int sum = S.charAt(i); // charAt -> char type임 char->정수형에 담기면 ->아스키 값으로 담김.
			if(arr[ch-'a']==-1) {
				arr[ch-'a'] = i;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
