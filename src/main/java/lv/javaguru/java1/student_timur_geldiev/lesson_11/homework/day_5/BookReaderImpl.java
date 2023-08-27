package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_5;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    List<Book> booksList = new ArrayList<>();


    @Override
    public boolean addBook(Book book) {
        if (isAdded(book)) {
            return false;
        }
        if (checkAuthorAndTitleExistence(book)) {
            return true;
        }
        for (int i = 0; i < booksList.size(); i++) {
            if (book.getAuthor().equals(booksList.get(i).getAuthor()) && book.getTitle().equals(booksList.get(i).getTitle())) {
                return false;
            }
        }
        return booksList.add(book);
    }

    @Override
    public boolean deleteBook(Book book) {
        if (!isAdded(book)) {
            return false;
        }
        return booksList.remove(book);
    }

    @Override
    public boolean isAdded(Book book) {
        for (int i = 0; i < booksList.size(); i++) {
            if (book.getAuthor().equals(booksList.get(i).getAuthor()) && book.getTitle().equals(booksList.get(i).getTitle())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkAuthorAndTitleExistence(Book book) {
        if (book.getAuthor().isEmpty() || book.getTitle().isEmpty()) {
            return false;
        }
        return true;
    }


}

