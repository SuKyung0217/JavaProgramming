
public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("Gray", 10, 2);
		System.out.println(myCar.color + " " + myCar.speed + " " + myCar.gear);
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar.speed);
		Car yourCar = new Car();
		yourCar.color="White";
		System.out.println(yourCar.color);
	}

}

