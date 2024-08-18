import java.util.Scanner;

public class Main{
	public int[] sortArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
				int tmp = arr[j];
				arr[j] =arr[j+1];
				arr[j+1] = tmp;
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int [size];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Main ma = new Main();
		arr = ma.sortArr(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
