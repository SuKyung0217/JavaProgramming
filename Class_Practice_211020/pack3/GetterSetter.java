package pack3;

public class GetterSetter {
	private String color;
	private int speed;
	private int gear;
	//getter = ���� �������� ��
	public String getColor() {
		return color;
	}
//	setter = ���� �����ϴ°�
	public void setColor(String color) {
		this.color = color;
	}
	
//	public String getColor() {
//		return color;
//	}

//	public void setColor(String color) {
//		this.color = color;
//	}

	public String fields() {
		String str = "Color = " + color + ", speed = " + speed + ", Gear = " + gear;
		return str;
	}
	@Override
	public String toString() {
		return "GetterSetter [color=" + color + "]";
	}
	
	

}
