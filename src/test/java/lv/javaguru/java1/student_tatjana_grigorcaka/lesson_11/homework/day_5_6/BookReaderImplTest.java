package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5_6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderImplTest {

    private BookReader reader = new BookReaderImpl();

    @Test
    public void addOneBook() {
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        Boolean result = reader.addBook(book);
        assertEquals(result, true);
    }

    @Test
    public void addTwoDifferentBooks() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        Boolean result = reader.addBook(book2);
        assertEquals(result, true);
    }


    @Test
    public void addOneTheSameBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        Book book3 = new Book("The Alchemist", "Paulo Coelho", false);
        Boolean result = reader.addBook(book3);
        assertEquals(result, false);
    }

    @Test
    public void addBookWithoutAuthor() {
        Book book = new Book("The Little Prince", "", false);
        Boolean result = reader.addBook(book);
        assertEquals(result, false);
    }

    @Test
    public void addBookWithoutTitle() {
        Book book = new Book("", "Antoine de Saint-Exupery", false);
        Boolean result = reader.addBook(book);
        assertEquals(result, false);
    }

    @Test
    public void deleteExistingBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        Boolean result = reader.deleteBook(book2);
        assertEquals(result, true);
    }

    @Test
    public void deleteNonExistingBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        Boolean result = reader.deleteBook(book1);
        assertEquals(result, false);
    }

    @Test
    public void getAllBooksList() {
        Book[] bookList = {
                new Book("The Little Prince", "Antoine de Saint-Exupery", false),
                new Book("The Alchemist", "Paulo Coelho", false),
                new Book("Reach dad poor dad", "Robert Kiyosaki", false),
        };
        reader.getAllBooks();
        int result = bookList.length;
        assertEquals(result, 3);
    }

    @Test
    public void findBooksByAuthor() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByAuthor("Antoine de Saint-Exupery" );
        int result = foundBooks.size();
        assertEquals(result, 1);
    }

    @Test
    public void findBooksByAuthorPrefix() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByAuthorPrefix("Antoine" );
        int result = foundBooks.size();
        assertEquals(result, 1);
    }

    @Test
    public void findBooksByTitle() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByTitle("The Little Prince" );
        int result = foundBooks.size();
        assertEquals(result, 1);
    }

    @Test
    public void findBooksByTitlePrefix() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", false);
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByTitlePrefix("The Little" );
        int result = foundBooks.size();
        assertEquals(result, 1);
    }

    @Test
    public void isRead() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", true);
        reader.addBook(book1);
        Boolean result = reader.isRead(book1);
        assertEquals(result, true);
    }

    @Test
    public void isNotRead() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", false);
        reader.addBook(book1);
        Boolean result = reader.isNotRead(book1);
        assertEquals(result, true);
    }

    @Test
    public void getAllReadBooks() {
        Book[] readBookList = {
                new Book("The Little Prince", "Antoine de Saint-Exupery", true),
                new Book("The Alchemist", "Paulo Coelho", true),
        };
        reader.getAllReadBooks();
        int result = readBookList.length;
        assertEquals(result, 2);
    }

    @Test
    public void getAllNotReadBooks() {
        Book[] notReadBookList = {
                new Book("Reach dad poor dad", "Robert Kiyosaki", false),
        };
        reader.getAllNotReadBooks();
        int result = notReadBookList.length;
        assertEquals(result, 1);
    }
}