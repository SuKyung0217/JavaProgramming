
public class Car {
	//field
	String color;
	int speed;
	int gear;
	//method overloading
	
	//method
	void changeGear(int g) {
		gear = g;
	}
	public Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
}
