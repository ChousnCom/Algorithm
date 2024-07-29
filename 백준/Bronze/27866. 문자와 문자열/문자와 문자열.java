import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int key = sc.nextInt();
		System.out.println(name.charAt(key-1));
		
	}

}
