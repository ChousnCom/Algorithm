import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        System.out.println(findSugar(sugar));

    }

    public static int findSugar(int sugar){
        int sum = 0;
        if(sugar % 5 == 0){
            sum= sugar/5;
        }
        else if(sugar == 4 || sugar == 7) {
            sum = -1;
        }else if(sugar%5==1 || sugar%5==3 || sugar%5==6 || sugar%5 ==8){
            sum = (sugar/5)+1;
        }else if(sugar%5==2 || sugar%5 ==4 || sugar%5==7|| sugar%5==9) {
            sum = (sugar/5)+2;
        }
        return sum;
    }
}

