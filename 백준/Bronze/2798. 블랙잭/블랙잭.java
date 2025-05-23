import java.util.Scanner;

//백준 2798 복습
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardCount = sc.nextInt();
        int targetNum = sc.nextInt();
        int[] cards = new int[cardCount];

        for (int i = 0; i < cardCount; i++) {
            cards[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < cardCount-2; i++) {
            if(cards[i] > targetNum) continue;

            for(int j = i+1; j < cardCount-1; j++){
                if(cards[i] + cards[j] > targetNum) continue;

                for(int k = j+1; k < cardCount; k++){

                    int sum = cards[i] + cards[j] + cards[k];

                    if(sum == targetNum){
                        res = sum;
                    }

                    if(sum<targetNum && res<sum){
                        res = sum;
                    }
                }
            }

        }
        System.out.println(res);

    }
}
