import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chess[] = {1,1,2,2,2,8}; //원래 있어야 할 체스말의 개수.
		int arr[] = new int[6]; //사용자가 찾은 체스 말의 개수
		
		for(int i = 0; i<6; i++) {
			arr[i] = sc.nextInt();
			System.out.print(chess[i]-arr[i]+" ");
		}
		
		
	}
}
