import java.util.Scanner;
//기존의 코드가 너무 비효율적.
// 같은 반복을 2번 사용해서 연산횟수가 너무 많음
// 소수구하는 알고리즘을 조금 더 최적화 할 필요가 있음.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		int min = last; // 최소값을 저장할 변수.
		int sum = 0; //소수들의 합을 저장할 변수.
		for(int i = first; i<=last; i++) {
			boolean isPrime = true; //소수인지 아닌지 check하는 isPrime 선언 true로 초기화
			if(i==1) {
				isPrime = false; //i는 1부터 시작할 수 있으나 1은 소수가 아니므로 해당 변수에 false로 초기화.
			}
			for(int j = 2; j<i; j++) { //소수 찾는 반복문 i가 증가함에 따라 각 수의 소수를 여부를 check
				if(i%j == 0) { //i를 j로 나누었을때 나누어 떨어진다면, 
					isPrime = false;// 그 값은 소수가 아님
					break; // 여기서 해당 반복을 멈춤. 	
				}
			}
			if(isPrime) { //소수라면
				if(min>i) { 
					min = i;
				}			
				sum+=i;	
			}
		}
		if(sum == 0) { //first 와 last사이에 만족하는 소수가 하나도 존재하지 않을 경우.
			System.out.println(-1);
		}else {
			System.out.println(sum+"\n"+min); //아닌경우 소수와 최소 값을 출력.
		}
	}
}
