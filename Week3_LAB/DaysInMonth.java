import java.util.*;
public class DaysInMonth {

		public static void main(String[] args) {
			int month,year;
			int days = 0;
			Scanner scan = new Scanner (System.in);
			
			System.out.print("�ϼ��� �˰� ���� �⵵�� �Է��Ͻÿ�:");
			year = scan.nextInt();
			
			System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�:");
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
		System.out.println("���� ������ "+ days);	
	}
}
