	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int depth = sc.nextInt();
			for(int i = 0; i<depth-1; i++) {
				for(int k = i+1; k<depth; k++) {
					System.out.print(" ");
				}
				for(int j = depth-1-(i*2); j<depth; j++) {
					System.out.print("*"); 
				}
				System.out.print("\n");
			}
			for(int i = depth-1; i>=0; i--) {
				for(int k = i+1; k<depth; k++) {
					System.out.print(" ");
				}
				for(int j = depth-1-(i*2); j<depth; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}