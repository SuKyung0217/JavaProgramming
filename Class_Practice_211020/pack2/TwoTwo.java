package pack2;

import pack1.OneOne;
public class TwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoOne bbb = new TwoOne();
		//bbb.b;	b�� private�̱� ������ ���� �Ұ���
		bbb.bb = 6;
		bbb.print();
		OneOne baa = new OneOne();
		//bbb.a;	b�� private�̱� ������ ���� �Ұ���
		//bbb.aa;	b�� private�̱� ������ ���� �Ұ���
		//bbb.aaa;	aaa�� protect������ ��Ӱ��谡 �ƴϱ� ������ ���� �Ұ���.
	}

}
