package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_5;

public class BookDemo {

    public static void main(String[] args) {

        Book myBook = new Book("Principles");
        String title = myBook.getTitle();
        System.out.println("Book title = " + title);
    }
}
