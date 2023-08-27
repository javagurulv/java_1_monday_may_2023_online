package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderImplTest {

    private BookReader reader = new BookReaderImpl();

    @Test
    public void addOneBook() {
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery");
        Boolean result = reader.addBook(book);
        assertEquals(result,true);
    }

    @Test
    public void addTwoDifferentBooks() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        Boolean result = reader.addBook(book2);
        assertEquals(result,true);
    }


    @Test
    public void addOneTheSameBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        reader.addBook(book2);
        Book book3 = new Book("The Alchemist", "Paulo Coelho");
        Boolean result = reader.addBook(book3);
        assertEquals(result,false);
    }

    @Test
    public void addBookWithoutAuthor() {
        Book book = new Book("The Little Prince", "");
        Boolean result = reader.isAddedTitleAndAuthor(book);
        assertEquals(result,false);
    }

    @Test
    public void addBookWithoutTitle() {
        Book book = new Book("", "Antoine de Saint-Exupery");
        Boolean result = reader.isAddedTitleAndAuthor(book);
        assertEquals(result,false);
    }

    @Test
    public void deleteExistingBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        reader.addBook(book2);
        Boolean result = reader.deleteBook(book2);
        assertEquals(result,true);
    }

    @Test
    public void deleteNonExistingBook() {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        Boolean result = reader.deleteBook(book1);
        assertEquals(result,false);
    }

    @Test
    public void createBooksList() {
        Book[] books = {
                new Book("The Little Prince", "Antoine de Saint-Exupery"),
                new Book("The Alchemist", "Paulo Coelho"),
                new Book("Reach dad poor dad", "Robert Kiyosaki"),
        };
        int result = reader.createBooksList(books);
        assertEquals(result, 3);
    }

    @Test
    public void findBooksByAuthor()  {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByAuthor("Antoine de Saint-Exupery");
        int result = foundBooks.size();
        assertEquals(result,1);
    }

    @Test
    public void findBooksByPrefix()  {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery");
        reader.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        reader.addBook(book2);
        List<Book> foundBooks = reader.findBooksByPrefix("Antoine");
        int result = foundBooks.size();
        assertEquals(result,1);
    }

}