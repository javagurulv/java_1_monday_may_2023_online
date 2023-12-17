package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_5_day_6;

import java.util.List;

interface BookReader {

    public boolean addBook(Book book);
    public boolean deleteBook(Book book);
    Book allBooksList();
    List<Book>bookSearchByAuthor(String author);
    List<Book>bookSearchByAuthorPrefix(String prefix);
    List<Book>bookSearchByTitle(String title);
    List<Book>bookSearchByTitlePrefix(String titlePrefix);
    public boolean isRead(Book book);
    public boolean isNotRead(Book book);
    Book allReadBooksList();
    Book allNotReadBooksList();



}
