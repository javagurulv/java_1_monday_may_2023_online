package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day5;

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
