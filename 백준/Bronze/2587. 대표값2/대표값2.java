import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
        avg=sum/5;
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}
