import java.util.Scanner;

public class LogOperator {

	public static void main(String[] args) {
		boolean i, j;
		//논리 연산자 : 논리값과 논리값 연산, 결과는 논리값(true, false)
		Scanner scn = new Scanner(System.in);
		System.out.print("첫 번째 논리값 입력 : ");
		i = scn.nextBoolean();
		System.out.print("두 번째 논리값 입력 : ");
		j = scn.nextBoolean();
		
		System.out.println(" !" + i + "=>" + (!i));
		System.out.println(i + "&&" + j + "=>" + (i&&j));
		System.out.println(i + "&&" + j + "=>" + (i||j));
	}
}
