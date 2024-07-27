import java.util.Scanner;

public class Main {
	public int findMax(int arr[], int depth) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public int findMin(int arr[], int dpeth) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int arr[] = new int[depth];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
			Main m = new Main();
			int max = m.findMax(arr, depth);
			int min = m.findMin(arr, depth);
			System.out.println(min+" "+max);
	}
}