import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //달팽이가 낮에 올라가는 거리
		int B = sc.nextInt(); //밤에 미끄러지는 거리
		int V = sc.nextInt(); //달팽이가 올라야할 최종 높이.
		int dayCount = (V-A)/(A-B); // 달팽이가 최종높이까지 올라가기전 하루전날.
		if((V-A)%(A-B)!=0) { //달팽이가 하루에 오르는 길이가 최종 높이보다 짧을때,
			dayCount++;
		}
		
		System.out.println(dayCount+1);
	}
}
