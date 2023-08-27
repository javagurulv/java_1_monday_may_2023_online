package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5;

import java.util.List;

interface BookReader {


    boolean addBook(Book book);

    boolean isAddedTitleAndAuthor(Book book);

    boolean deleteBook(Book book);

    int createBooksList(Book[] books);

    List<Book> findBooksByAuthor(String bookAuthorToSearch);

    List<Book> findBooksByPrefix(String prefix);

}
