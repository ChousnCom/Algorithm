import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetN = sc.nextInt(); 

        int res = 0;
        for (int i = 0; i < targetN; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10; 
                number /= 10; 
            }
            if (sum + i == targetN) { 
                res = i; 
                break;
            }
        }
        System.out.println(res);
    }
}
