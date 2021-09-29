//import java.util.Calendar;
import java.util.Date;

public class Welcome {
	public static void main(String[] args) {
	
		Date date = new Date();
		int currentHour = date.getHours();
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(1 2);;
//		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재시간은 "+ date);
		if(currentHour < 11) {
		System.out.println("Good morning");
		}else if(currentHour < 15) {
		System.out.println("Good afternoon");
		}else if(currentHour < 20) {
		System.out.println("Good evening");
		}else {
		System.out.println("Good night");
		}
	}
}
