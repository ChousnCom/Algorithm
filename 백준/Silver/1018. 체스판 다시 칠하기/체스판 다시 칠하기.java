import java.util.Scanner;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        arr = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true; 
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int M_row = M - 7;
        int N_row = N - 7;
        for (int i = 0; i < M_row; i++) {
            for (int j = 0; j < N_row; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean TF = arr[x][y];
        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){

                if(arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}

