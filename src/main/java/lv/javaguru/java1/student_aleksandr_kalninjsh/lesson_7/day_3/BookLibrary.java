package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class BookLibrary {
    private List<Book> books = new ArrayList();

    public List<Book> bookSearchByTitle(String name) {
        List<Book> bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name)) {
                bookSearch.add(book);
            }
        }
        return bookSearch;
    }

    public List<Book> bookSearchByAuthor(String author) {
        List<Book> bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                bookSearch.add(book);
            }
        }
        return bookSearch;
    }

    public int pageCountByAuthor(List<Book>books, String author) {
        int pageCount = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                pageCount = pageCount + book.getNumberOfPages();
            }
        }
        return pageCount;
    }


    public void bookDeleting(String name, String author, int yearOfIssue) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getYearOfIssue() == yearOfIssue && (book.getName().equals(name)) && (book.getAuthor().equals(author))) {

            }
            books.remove(book);
        }
    }
}
