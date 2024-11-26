import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int leng[] = new int[3]; // 세 변의 길이를 배열로 입력 받음
		 for(int i = 0; i<3; i++) {
			 leng[i] = sc.nextInt(); //삼각형의 변의 갯수는 3개이므로 3번 입력 받음
		 }
		 Arrays.sort(leng); //Arrays.sort() 로 오름 차순 정렬 이때 빗변은 무조건 배열의 마지막 idx;
		 int hypotenuse = leng[2]; // 빗변 변수 선언해주고 해당 변수에 leng[2] 값을 저장
		 while(true) { 
			 if(leng[0]+leng[1]<=hypotenuse) { //삼각형의 조건 중 나머지 길이의 합이 빗변 길이보다 작거나 같다면 
				 // 빗변 길이 1 씩 갑소.
				 hypotenuse--;
			 }
			 if(leng[0]+leng[1]>hypotenuse) { //만약 삼각형의 조건을 만족한다면 반복문 탈출
				 break;
			 }
		 }
		 int res = 0; // 결과값 저장
		 res = hypotenuse + leng[1]+leng[0]; // 삼각형의 둘레를 res에 저장
		 System.out.println(res);
	}
}
