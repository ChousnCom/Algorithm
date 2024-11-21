import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //입력할 정수
		int k = sc.nextInt(); //정수의 약수중 k번째로 작은값 출력하기 입력.
		int count = 0;
		int arr[] = new int[n]; //약수를 저장할 배열 생성
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) { //약수 구하는 알고리즘 
				count++; //약수가 나올때마다 순차적으로 1씩 증가
				arr[count]=i; //약수를 담을 배열로 다시 초기화 == 이때 이 배열에는 약수가 들어가게 됨
			}
		}
		if(count<k) { //약수의 개수보다 입력값이 더 높을 경우 0으로 초기화
			System.out.print(0);
		}
		for(int i = 1; i<=count; i++) { //아닐 경우 해당 idx에 위치한 약수 값 출력 ==> 이 배열은 이미 정렬되어있는 상태
			if(k==i) {
				System.out.println(arr[i]);
			}
		}
	}
		
}

