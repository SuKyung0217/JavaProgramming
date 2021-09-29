
public class CalSum {

	public static void main(String[] args) {
		
		int i = 1;
		int evenSum = 0,oddSum = 0;
		
		while(i <= 10) {
			if(i%2 == 0)
				evenSum = evenSum + i;
			else
				oddSum = oddSum + i;
			i++;
		}
		System.out.println("Â¦¼ö ÇÕ°è=" + evenSum + ", È¦¼ö ÇÕ°è = " + oddSum);
	}

}
