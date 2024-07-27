import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int arr[] = new int[depth];
		int key = sc.nextInt();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
				if(arr[i]<key) {
					System.out.print(arr[i]+" ");
				}
		}
	}

}