import java.util.Scanner;

public class RelOperator {
	public static void main(String[] args) {
		int i, j;
		//�� Ȥ�� ���� ������ : ���� �� ���� ����� ����(true, false)
		// == != >= < <=
		Scanner scn = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		i = scn.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		j = scn.nextInt();
		System.out.println(i + "==" + j + "==" + (i==j));
		System.out.println(i + "!=" + j + "=>" + (i!=j));
		System.out.println(i + ">=" + j + ">" + (i>j));
		System.out.println(i + ">=" + j + ">=" + (i>=j));
		System.out.println(i + ">=" + j + "<" + (i<j));
		System.out.println(i + ">=" + j + "<=" + (i<=j));
	}
}
