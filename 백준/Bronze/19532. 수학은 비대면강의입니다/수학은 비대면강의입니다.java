import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int res1 = 0;
        int res2 = 0;
        for(int i = -999; i<=999; i++){
            for(int j = -999; j<=999; j++){
                if(a*i + b*j ==c){
                    if(d*i + e*j == f)  {
                        res1 = i;
                        res2 = j;
                    }
                }
            }
        }
        System.out.println(res1 + " " + res2);
    }
}
