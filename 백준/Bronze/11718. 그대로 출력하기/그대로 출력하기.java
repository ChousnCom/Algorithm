import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = ""; 
		while(sc.hasNextLine()){
			st = sc.nextLine();
			System.out.println(st);
		}
	}
}