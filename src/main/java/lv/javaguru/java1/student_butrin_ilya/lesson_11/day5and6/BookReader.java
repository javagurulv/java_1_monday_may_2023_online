package lv.javaguru.java1.student_butrin_ilya.lesson_11.day5and6;

import java.util.List;

public interface BookReader {
    public boolean addBook(Book book);
    public boolean deleteBook(Book book);
    public String[] allList ();
    public List<Book> findByAuthor(String author);
    public List<Book> findByPrefix(String prefix);
    public List<Book> findByTitle(String title);
    public boolean bookIsReaded(Book book);
    public boolean bookIsNoReaded(Book book);
    public String[] getReadedList();
    public String[] getNoReadedList();
}
