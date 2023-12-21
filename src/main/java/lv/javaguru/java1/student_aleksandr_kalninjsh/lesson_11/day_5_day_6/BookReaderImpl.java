package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_5_day_6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private List<Book> books = new ArrayList<>();

    Book[] addBookList = {
            new Book("Mark Twain", "Tom Sawyer abroad"),
            new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion"),
            new Book("Stephen King", "It")
    };

    @Override
    public boolean addBook(Book book) {
        if (book.getAuthor().equals(" ") || book.getTitle().equals(" ")) {
            return false;
        }

        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getAuthor())) {
                books.remove(book);
                return false;
            }
        }
        return true;
    }

    @Override
    public Book allBooksList() {
        for (Book book : addBookList) {
            System.out.println("All books list: " + book.getAuthor() + " " + book.getTitle());
        }
        return null;
    }

    @Override
    public List<Book>bookSearchByAuthor(String bookAuthor) {
        List<Book>bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(bookAuthor)) {
                bookSearch.add(books.get(i));
            }
        }
        return bookSearch;
    }

    @Override
    public List<Book>bookSearchByAuthorPrefix(String bookAuthorPrefix) {
        List<Book>bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().startsWith(bookAuthorPrefix)) {
                bookSearch.add(books.get(i));
            }
        }
        return bookSearch;
    }

    @Override
    public List<Book>bookSearchByTitle(String bookTitle) {
        List<Book>bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(bookTitle)) {
                bookSearch.add(books.get(i));
            }
        }
        return bookSearch;
    }

    @Override
    public List<Book>bookSearchByTitlePrefix(String bookTitlePrefix) {
        List<Book>bookSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().startsWith(bookTitlePrefix)) {
                bookSearch.add(books.get(i));
            }
        }
        return bookSearch;
    }

    @Override
    public boolean isRead(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                books.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isNotRead(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                books.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Book allReadBooksList() {
        for (Book book : addBookList) {
            System.out.println("All read books: " + book.getAuthor() + " " + book.getTitle());
        }
        return null;
    }

    @Override
    public Book allNotReadBooksList() {
        for (Book book : addBookList) {
            System.out.println("All not read books: " + book.getAuthor() + " " + book.getTitle());
        }
        return null;
    }
}

