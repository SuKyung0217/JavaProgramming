import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		double radius,area;
		
		System.out.print("원의 반지름 입력 : ");
		radius = scanner.nextDouble();
		
		area = Math.PI * radius * radius;
		
//		System.out.println(area);
		System.out.printf("%.1f\n", area);
		scanner.close();
	}

}
