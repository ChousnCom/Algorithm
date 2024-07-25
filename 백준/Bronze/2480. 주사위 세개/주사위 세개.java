import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		
		int sum = 0;
		if(d1==d2 && d2==d3 && d1==d3) {
			sum = 10000+(((d1+d2+d3)/3)*1000);
		}else if(d1==d2) {
			sum = 1000+((d1+d2)/2)*100;	
		}else if(d2==d3) {
			sum = 1000+((d2+d3)/2)*100;	
		}else if(d1 == d3) {
			sum = 1000+((d1+d3)/2)*100;	
		}else if(d1!=d2 && d1!=d3 && d2!=d3) {
			if(d1>d2 && d1>d3) {
				sum = (d1*100);
			}else if (d2>d1 && d2>d3) {
				sum = (d2*100);
			}else if(d3>d1 && d3>d2) {
				sum = (d3*100);
			}
		}
		System.out.println(sum);
	}

}
