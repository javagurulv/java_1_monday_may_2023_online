package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_5;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book);
    boolean isAdded(Book book);
    boolean checkAuthorAndTitleExistence(Book book);
    boolean deleteBook(Book book);

}
