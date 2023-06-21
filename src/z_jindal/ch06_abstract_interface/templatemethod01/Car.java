package z_jindal.ch06_abstract_interface.templatemethod01;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();

	public void turnOn(){
		System.out.println("시동을 켭니다");
	}

	public  void turnOff(){
		System.out.println("시동을 끕니다.");
	}

	final public void run(){
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
