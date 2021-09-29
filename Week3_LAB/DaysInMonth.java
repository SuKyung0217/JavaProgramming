import java.util.*;
public class DaysInMonth {

		public static void main(String[] args) {
			int month,year;
			int days = 0;
			Scanner scan = new Scanner (System.in);
			
			System.out.print("일수를 알고 싶은 년도를 입력하시오:");
			year = scan.nextInt();
			
			System.out.print("일수를 알고 싶은 월을 입력하시오:");
			month = scan.nextInt();
			
			switch (month) {
			case 4: 
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if(year%4==0 && year%100!=0 || year%400==0)
					days = 29;
				else
					days = 28;	
				break;
			default:
				days = 31;
				break;
		}
		System.out.println("월의 날수는 "+ days);	
	}
}
