import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[N][M];
		int arr1[][] = new int[N][M];
		int arr2[][] = new int[N][M];
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				arr2[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}