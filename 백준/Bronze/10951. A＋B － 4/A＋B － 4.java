import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Eof? - > End of file == 파일의 끝을 검사하여 더이상 입력받을 데이터가 없을때 반복 종료
		// 자바에서는 hasNextLine(), hasNext(); 사용
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		while(sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			result = x+y;
			System.out.println(x+y);
		}
	}
}
