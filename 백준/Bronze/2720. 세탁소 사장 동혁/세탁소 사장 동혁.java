import java.util.Scanner;
//쿼터 == 25
//다임 == 10
//니켈 == 5
//페니 == 1

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt(); //입력 받을 달러 갯수 
		int change[] = new int[depth]; // change배열 선언 depth 크기만큼
		for(int i = 0; i<depth; i++) { // depth 크기만큼 change 배열에 달러를 저장
			change[i] = sc.nextInt();
		}
		int coin[] = {25,10,5,1}; //조건부 코인 생성 쿼터, 다임, 니켈, 페니 순
		for(int i=0; i<depth; i++) { // 첫번째 반복문 depth만큼 coin배열의 열 출력
			int res[] = new int[4];
			
			for(int j = 0; j<coin.length; j++) { //coin배열의 길이만큼
				
				while(change[i]>=coin[j]) { // change 배열에 저장된 값이 coin배열에 저장된 값보다크다면
					// change[i] 에서 coin[j]를 빼주고 결과값 배열을 하나씩 증가.
					change[i] -= coin[j];
					res[j]++;
				}
			}
			for(int j=0; j<res.length; j++) {
				System.out.print(res[j]+" "); // 결과 값 출력
			}
			System.out.print("\n");
		}
		
		//쿼터 조건 25 이상
		//다임 조건 10 이상 쿼터 미만
		//니켈 조건 5 이상 다임 미만
		//페니 1이상 니켈 미만
		
	}
}
