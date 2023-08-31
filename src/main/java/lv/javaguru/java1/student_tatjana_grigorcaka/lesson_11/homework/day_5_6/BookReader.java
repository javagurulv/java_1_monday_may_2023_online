package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5_6;

import java.util.List;

interface BookReader {


    boolean addBook(Book book);


    boolean deleteBook(Book book);

    Book getAllBooks();
    List<Book> findBooksByAuthor(String bookAuthorToSearch);

    List<Book> findBooksByAuthorPrefix(String prefix);

    List<Book> findBooksByTitle(String bookTitleToSearch);

    List<Book> findBooksByTitlePrefix(String prefix);

    boolean isRead(Book book);

    boolean isNotRead(Book book);

    Book[] getAllReadBooks();

    Book[] getAllNotReadBooks();


}
