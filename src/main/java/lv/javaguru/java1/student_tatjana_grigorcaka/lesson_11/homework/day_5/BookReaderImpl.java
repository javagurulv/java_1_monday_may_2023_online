package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5;




import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private List<Book> books = new ArrayList();


    @Override
    public boolean addBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                return false;
            }
            if (book.getAuthor().isEmpty() || book.getTitle().isEmpty()) {
                return false;
            }
        }
        return books.add(book);
    }

    @Override
    public boolean isAddedTitleAndAuthor(Book book) {
        if (book.getAuthor().isEmpty() || book.getTitle().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int createBooksList(Book[] books) {
        if (books.length == 0) {
            return 0;
        } else {
            return books.length;
        }
    }

    @Override
    public List<Book> findBooksByAuthor(String bookAuthorToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(bookAuthorToSearch)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findBooksByPrefix(String prefix) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().startsWith(prefix)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }
}

