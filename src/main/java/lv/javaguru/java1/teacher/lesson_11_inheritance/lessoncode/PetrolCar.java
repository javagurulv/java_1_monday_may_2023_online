package lv.javaguru.java1.teacher.lesson_11_inheritance.lessoncode;

public class PetrolCar extends Car {

	public PetrolCar(String model) {
		super(model);
	}

	@Override
	public void start() {
		System.out.println("Start Petrol Engine!");
	}

	@Override
	public void stop() {
		System.out.println("Stop Petrol Engine!");
	}

}
