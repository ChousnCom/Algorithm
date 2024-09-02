import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int max = arr[0][0];
		int mIdx1 = 1;
		int mIdx2 = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
					mIdx1=(i+1);
					mIdx2=(j+1);
				}
			}
		}
		System.out.println(max);
		System.out.println(mIdx1+" "+mIdx2);
	}

}