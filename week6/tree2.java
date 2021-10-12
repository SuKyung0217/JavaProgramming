package week6;

public class tree2 {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for	(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
}
