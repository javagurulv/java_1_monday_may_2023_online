package lv.javaguru.java1.teacher.lesson_10_inheritance.lessoncode;

public class Book extends Object {

	private String title;

	public Book(String title) {
		this.title = title;
	}

	public static void main(String[] args) {
		Book b = new Book("");
	}
}
