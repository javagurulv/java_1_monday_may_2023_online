package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5_6;

import java.util.Arrays;

public class BookReaderImplDemo {

    public static void main(String[] args) {

        BookReaderImpl bookReaderImpl = new BookReaderImpl();

        bookReaderImpl.getAllBooks();
        System.out.println();

        bookReaderImpl.getAllReadBooks();
        System.out.println();

        bookReaderImpl.getAllNotReadBooks();
        System.out.println();

        bookReaderImpl.isRead(new Book("The Little Prince", "Antoine de Saint-Exupery", true));
        System.out.println("Book 1 Is Read: " + bookReaderImpl.isRead(new Book("The Little Prince", "Antoine de Saint-Exupery", true)));

    }
}
