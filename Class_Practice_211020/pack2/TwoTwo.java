package pack2;

import pack1.OneOne;
public class TwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoOne bbb = new TwoOne();
		//bbb.b;	b가 private이기 때문에 접근 불가능
		bbb.bb = 6;
		bbb.print();
		OneOne baa = new OneOne();
		//bbb.a;	b가 private이기 때문에 접근 불가능
		//bbb.aa;	b가 private이기 때문에 접근 불가능
		//bbb.aaa;	aaa가 protect이지만 상속관계가 아니기 때문에 접근 불가능.
	}

}
