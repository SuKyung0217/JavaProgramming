package pack2;

import pack1.OneOne;

public class TwoThree extends OneOne{
	int bbb;
	
	public static void main(String[] args) {
		OneOne bbaa = new OneOne();
		//bbaa.a	private
		//bbaa.aa	default
		//bbaa.aaa = 5; protected ��ӹ��� Ŭ���� ��ü���� �׽�Ʈ�ؾ� ��
		bbaa.aaaa = 6;	//public 
		
		TwoThree bbaaa = new TwoThree();
		//bbaaa.a = 1; 	private
		//bbaaa.aa = 1;	default
		bbaaa.aaa = 6;
		bbaaa.aaaa = 6;
	}
}
