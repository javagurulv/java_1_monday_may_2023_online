package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_5_day_6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookReaderImplTest {

    BookReaderImpl reader = new BookReaderImpl();

    @Test
    public void addBook() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        boolean result = reader.addBook(book3);
        assertEquals(result, true);
    }

    @Test
    public void addTheSameBook() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        boolean result = reader.addBook(book3);
        assertEquals(result, false);
    }

    @Test
    public void addBookWithoutAuthor() {
        Book book = new Book(" ", "Tom Sawyer abroad");
        boolean result = reader.addBook(book);
        assertEquals(result, false);
    }

    @Test
    public void addBookWithoutTitle() {
        Book book = new Book("Mark Twain", " ");
        boolean result = reader.addBook(book);
        assertEquals(result, false);
    }

    @Test
    public void deleteBook() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Stephen King", "It");
        reader.addBook(book2);
        boolean result = reader.deleteBook(book1);
        assertEquals(result, true);
    }

    @Test
    public void allBooksList() {
        Book[] addBookList = {
                new Book("Mark Twain", "Tom Sawyer abroad"),
                new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion"),
                new Book("Stephen King", "It")
        };
        reader.allBooksList();
        int result = addBookList.length;
        assertEquals(result, 3);
    }

    @Test
    public void bookSearchByAuthor() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        List<Book> bookSearch = reader.bookSearchByAuthor("Mark Twain");
        int result = bookSearch.size();
        assertEquals(result, 1);
    }

    @Test
    public void bookSearchByAuthorPrefix() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        List<Book>bookSearch = reader.bookSearchByAuthorPrefix("Mark");
        int result = bookSearch.size();
        assertEquals(result, 1);
    }

    @Test
    public void bookSearchByTitle() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        List<Book>bookSearch = reader.bookSearchByTitle("Tarzan and the Golden Lion");
        int result = bookSearch.size();
        assertEquals(result, 1);
    }

    @Test
    public void bookSearchByTitlePrefix() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        List<Book>bookSearch = reader.bookSearchByTitlePrefix("Tom");
        int result = bookSearch.size();
        assertEquals(result, 1);
    }

    @Test
    public void isRead() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        boolean result = reader.isRead(book3);
        assertEquals(result, true);
    }

    @Test
    public void isNotRead() {
        Book book1 = new Book("Mark Twain", "Tom Sawyer abroad");
        reader.addBook(book1);
        Book book2 = new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion");
        reader.addBook(book2);
        Book book3 = new Book("Stephen King", "It");
        reader.addBook(book3);
        boolean result = reader.isNotRead(book3);
        assertEquals(result, true);
    }

    @Test
    public void allReadBooksList() {
        Book[] addBookList = {
                new Book("Mark Twain", "Tom Sawyer abroad"),
                new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion"),
                new Book("Stephen King", "It")
        };
        reader.allReadBooksList();
        int result = addBookList.length;
        assertEquals(result, 3);
    }

    @Test
    public void allNotReadBooksList() {
        Book[] addBookList = {
                new Book("Mark Twain", "Tom Sawyer abroad"),
                new Book("Edgar Rice Burroughs", "Tarzan and the Golden Lion"),
                new Book("Stephen King", "It")
        };
        reader.allNotReadBooksList();
        int result = addBookList.length;
        assertEquals(result, 3);
    }
}
