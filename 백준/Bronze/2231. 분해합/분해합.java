import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String targetN = sc.nextLine(); 

        int len = targetN.length(); 

        int N = Integer.parseInt(targetN); 

        int res = 0;

        for(int i = N - (len*9); i<N; i++){ 
            int num = i;
            int sum = 0;

            while(num!=0){
                sum+=num%10;
                num/=10; 
            }
            if(sum+i == N){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}