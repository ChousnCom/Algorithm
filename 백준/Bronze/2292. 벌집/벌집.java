import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int room = sc.nextInt(); //입력할 목표지점 방
		int count = 1; // count == 1 로 초기화
		int range = 2; // 늘어나는 범위의 기준값 
		if(room == 1) {
			count = 1;
		}else { 
			while(range<=room) {
				range = range+(6*count); //방은 6, 8, 12 순으로 6의 배수로 늘어남. 범위를 6의 배수로 초기화 range가 입력한 
				// 방의 개수보다 작거나 같을때 까지, 
				count+=1; // count값 증가
			}
		}
			System.out.println(count);
	}

}
