import java.util.Scanner;

public class UnOperator {

	public static void main(String[] args) {
		int i , j;
		// 단항 연산자 : 부호,!,-,++,--
		// == != > >= < <=
		// a와 b를 더합니다.
		
		i = 0;
		i = i + 1;
		System.out.println(i);
		
		i = 0;
		i += 1;
		System.out.println(i);
		
		i = 0;
		i++;
		System.out.println(i);
		
		i = 0;
		++i;
		System.out.println(i);
		
		i = 0;
		j = ++i;
		System.out.println("i = " + i +", j = " + j);
		
		i = 0;
		j = i++;
		System.out.println("i = " + i +", j = " + j);
		
		i = 0;
		j = i++ + i++ + i++;
		System.out.println("i = " + i +", j = " + j);
		
		i = 0;
		j = ++i + ++i + ++i;
		System.out.println("i = " + i +", j = " + j);
	}

}
