import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		double radius,area;
		
		System.out.print("¿øÀÇ ¹ÝÁö¸§ ÀÔ·Â : ");
		radius = scanner.nextDouble();
		
		area = Math.PI * radius * radius;
		
//		System.out.println(area);
		System.out.printf("%.1f\n", area);
		scanner.close();
	}

}
