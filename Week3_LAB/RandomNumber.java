import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		System.out.print("������ ����: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			int number = generator.nextInt();
			sum += number;
		}
		System.out.println("���� " + count + "���� ���� " + sum);
	}

}
