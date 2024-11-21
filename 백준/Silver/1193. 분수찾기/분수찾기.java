import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int X = sc.nextInt();
		 int numberator=1;//분자
		 int denominator=1; //분모
		 int T = 0;
		 int n = 0;
		 if(X==1) {
			 numberator = 1;
			 denominator = 1;
		 }else {
			 while(n<X) { //입력한X가 어느 그룹에 위치하는지를 표기
				 T++;
				 n=T*(T+1)/2;
			 }
			 int place = X-(T-1)*T/2;
			 if(T%2==0) { //T가 짝수라면 분자가 순차적으로 증가
				 denominator = T-place+1;
				 numberator = place;
				 
			 }else { //T가 홀수라면 분모가 순차적으로 증가
				 numberator = T-place+1;
				 denominator = place;
			 }
		 }
		 System.out.println(numberator+"/"+denominator);
	}
}
