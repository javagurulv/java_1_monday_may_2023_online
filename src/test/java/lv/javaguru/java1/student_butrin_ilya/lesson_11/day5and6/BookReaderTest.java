package lv.javaguru.java1.student_butrin_ilya.lesson_11.day5and6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderTest {
    Book KapDoch = new Book("Kapitanskaya Dochka", "Puskin", 1870);
    Book igrok = new Book("Igrok", "Dostoevskiy", 1790);
    Book mtciri = new Book("mtciri", "Lermontov", 1870);
    Book mufta = new Book("mufta", "", 1770);
    Book smert = new Book("", "komenskaja", 1990);
    Book rasskazy = new Book("rasskazy", "Pushin", 1884);
    Book rasskazy2 = new Book("ras2", "Lenin", 1880);
    BookReader reader = new BookReaderImpl();

    @Test
    public void test1() {
        boolean expected = reader.addBook(KapDoch);
        boolean real = true;
        assertEquals(expected, real);

    }

    @Test
    public void test2() {
        boolean x = reader.addBook(mtciri);
        boolean expected = reader.addBook(KapDoch);
        boolean real = true;
        assertEquals(expected, real);
    }

    @Test
    public void test3() {
        reader.addBook(mtciri);
        reader.addBook(KapDoch);
        boolean expected = reader.addBook(KapDoch);
        boolean real = false;
        assertEquals(expected, real);
    }

    @Test
    public void test4() {
        reader.addBook(mtciri);
        reader.addBook(KapDoch);
        boolean expected = reader.addBook(mtciri);
        boolean real = false;
        assertEquals(expected, real);
    }

    @Test
    public void test5() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        boolean expected = reader.addBook(mtciri);
        boolean real = true;
        assertEquals(expected, real);
    }

    @Test
    public void test6() {
        BookReaderImpl book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(KapDoch);
        book.addBook(mtciri);
        int real = book.getBooks().size();
        int expected = 3;
        assertEquals(expected, real);
    }

    @Test
    public void test7WithoutAuthor() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        boolean expected = reader.addBook(mufta);
        boolean real = false;
        assertEquals(expected, real);
    }

    @Test
    public void test8WithoutTitle() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        boolean expected = reader.addBook(smert);
        boolean real = false;
        assertEquals(expected, real);
    }

    @Test
    public void test9ListSize() {
        BookReaderImpl book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(smert);
        book.addBook(mufta);
        book.addBook(KapDoch);
        book.addBook(mtciri);
        int real = book.getBooks().size();
        int expected = 3;
        assertEquals(expected, real);
    }

    @Test
    public void test10DeleteBook() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        reader.addBook(mtciri);
        boolean expected = reader.deleteBook(igrok);
        boolean real = true;
        assertEquals(expected, real);
    }

    @Test
    public void test11DeleteBook() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        reader.addBook(mtciri);
        boolean expected = reader.deleteBook(mufta);
        boolean real = false;
        assertEquals(expected, real);
    }

    @Test
    public void test12ListSizeAfterDelite() {
        BookReaderImpl book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(smert);
        book.addBook(mufta);
        book.addBook(KapDoch);
        book.addBook(mtciri);
        book.deleteBook(igrok);
        book.deleteBook(KapDoch);
        int real = book.getBooks().size();
        int expected = 1;
        assertEquals(expected, real);
    }

    @Test
    public void test13ListSizeAfterDelite() {
        BookReaderImpl book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(smert);
        book.addBook(mufta);
        book.addBook(mtciri);
        book.deleteBook(mufta);
        book.deleteBook(KapDoch);
        int real = book.getBooks().size();
        int expected = 2;
        assertEquals(expected, real);
    }

    @Test
    public void test14Alllist() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        reader.addBook(mtciri);
        String[] expected = reader.allList();
        String expexted = expected[0];
        String real = "Igrok[Dostoevskiy]";
        assertEquals(expexted, real);
    }

    @Test
    public void test15ListAuthor() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        List<Book> authorBooks = book.findByAuthor("Puskin");
        int expected = authorBooks.size();
        int real = 1;
        assertEquals(expected, real);
    }

    @Test
    public void test16FindByPrefix() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        book.addBook(rasskazy);
        List<Book> authorBooks = book.findByPrefix("Pu");
        int expected = authorBooks.size();
        int real = 2;
        assertEquals(expected, real);
    }

    @Test
    public void test17findByTittle() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        List<Book> authorBooks = book.findByTitle("Igrok");
        int expected = authorBooks.size();
        int real = 1;
        assertEquals(expected, real);
    }

    @Test
    public void test18findByTittleZero() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        List<Book> authorBooks = book.findByTitle("Iok");
        int expected = authorBooks.size();
        int real = 0;
        assertEquals(expected, real);
    }

    @Test
    public void test19findByTittlePrefix() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(rasskazy);
        book.addBook(rasskazy2);
        List<Book> authorBooks = book.findByTitle("ra");
        int expected = authorBooks.size();
        int real = 2;
        assertEquals(expected, real);
    }

    @Test
    public void test20bookIsReaded() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        boolean expected = book.bookIsReaded(mtciri);
        boolean real = true;
        assertEquals(expected, real);
    }
    @Test
    public void test21bookIsNoReaded() {
        BookReader book = new BookReaderImpl();
        book.addBook(igrok);
        book.addBook(mtciri);
        book.addBook(KapDoch);
        boolean expected = book.bookIsNoReaded(mtciri);
        boolean real = true;
        assertEquals(expected, real);
    }
    @Test
    public void test22ReadedList() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        reader.addBook(mtciri);
        reader.bookIsReaded(igrok);
        reader.bookIsReaded(KapDoch);
        reader.getReadedList();

        String[] expected = reader.getReadedList();
        String expexted = expected[0];
        String real = "Igrok[Dostoevskiy]";
        assertEquals(expexted, real);
    }
    @Test
    public void test23NoReadedList() {
        reader.addBook(igrok);
        reader.addBook(KapDoch);
        reader.addBook(mtciri);
        reader.bookIsNoReaded(igrok);
        reader.bookIsNoReaded(KapDoch);
        reader.getNoReadedList();

        String[] expected = reader.getReadedList();
        String expexted = expected[0];
        String real = "Igrok[Dostoevskiy]";
        assertEquals(expexted, real);
    }
}