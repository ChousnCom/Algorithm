import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int tmp =1;
		int sum = 0;
		for(int i=0; i<depth; i++) {
			int count =1; // 반복문 내에서 계속 count가 1을 유지할 수 있도록 초기화 시킴.
			tmp *= 2; // 점이 늘어나는 증가폭.
			count+=tmp; // 출력결과에 맞춰 1을 넣으면 바로 9가 나오도록 점의 개수를 알맞게 증가시킴
			sum = count*count; // 해당 점의 개수를 제곱하여 sum 값에 저장.
			
		}
		System.out.println(sum);
	}
}

//사각형의 점은 초기값을 기준으로 1, 2, 4, 8 .... 2의 배수로 증가
// 즉 초기 값에서 점은 2,3,5,9.... 씩 증가하게 됨.
// 점의 개수는 정사각형이라는 기준을 두고 맨 위의 줄의 점의 개수만 안다면 제곱해서 풀 수 있음.
