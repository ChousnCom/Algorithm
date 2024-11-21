import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean arr[][] = new boolean[100][100]; // 도화지 전체 넓이 (boolean으로 선언)
		int depth = sc.nextInt(); // 색종이 갯수 입력 받기
		int left = 0; //왼쪽 초기화
		int right = 0; //오른쪽(색종이 밑단 부분 초기화)
		int count = 0;
		for(int i = 0; i<depth; i++) {
			left = sc.nextInt(); //왼쪽 차이 입력받기
			right =sc.nextInt(); //밑쪽 차이 입력 받기 
			for(int j = left; j<10+left; j++) { //띄워져 있는 부분부터 10만큼 길이 추가
				for(int k=right; k<10+right; k++) { // 마찬가지
					if(!arr[j][k]) { // 만약 해당 칸이 0이 아니라면  비워져 있지 않다면
						arr[j][k] = true; // 색종이 넓이 1 true로 초기화
						count++; // 채워져 있는 부분이면 count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}
	
}
