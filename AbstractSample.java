public class AbstractSample extends Car {
	public static void main(String[] args) {
		Car car = new AbstractSample();
		car.setSpeed(100);
	}
	public void setSpeed(int speed) {
		System.out.println("Set speed to: " + speed);
	}
}

abstract class Car {
	Car() { System.out.println("Default Color: Red"); };
	abstract void setSpeed(int speed);	//Abstract method must be implemented
	void setColor() {};					//Optional
}