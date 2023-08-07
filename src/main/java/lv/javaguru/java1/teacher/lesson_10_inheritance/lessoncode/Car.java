package lv.javaguru.java1.teacher.lesson_10_inheritance.lessoncode;

public abstract class Car extends Object {

	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public abstract void start();

	public abstract void stop();

}
