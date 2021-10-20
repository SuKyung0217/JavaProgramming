
public class People {
	String name;
	int age;
	boolean sex;
	int height;
	People(String name)
	{
		this.name = name;
	}
	public People(String name, int age, boolean sex, int height) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	void changeHeight(int h) {
		height = h;
	}
	void changeAge() {
		age++;
	}
}

