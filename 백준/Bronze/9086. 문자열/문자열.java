import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		sc.nextLine();
		String name = "";
		int key = 0;
		for(int i=0; i<depth; i++) {
			name = sc.nextLine();
			System.out.println(name.charAt(0)+""+name.charAt(name.length()-1));
		}
	}
}
