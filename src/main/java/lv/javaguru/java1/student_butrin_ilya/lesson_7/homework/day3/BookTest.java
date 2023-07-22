package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day3;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(books, "o tsare soltane", "puskin", 1814, 110);
        bookLibrary.addBook(books, " tsare soltane", "puskin", 1815, 234);
        bookLibrary.addBook(books, "o soltane", "puskin", 1816,231);
        bookLibrary.addBook(books, "soltane", "puskin", 1817,868);
        bookLibrary.howManyBooks(books);
        bookLibrary.searchBookTitle(books, "o soltane");
        bookLibrary.searchBookAuthor(books, "puskin");
        BookTest bookApp = new BookTest();
        bookApp.testSearchBookTitle(books);
        bookApp.testSearchBookAuthor(books);
        bookApp.testSum(books);
        bookApp.testBookRemove(books);

    }
public void testSum (List<Book> books){

        int realrezult = 1443;
        BookLibrary bookLibrary = new BookLibrary();
        int expectedRezult = bookLibrary.pageSum(books, "puskin");
        if (realrezult == expectedRezult) System.out.println("ok!!");

}
    public void testSearchBookTitle(List<Book> books ) {
        BookLibrary bookLibrary = new BookLibrary();
        List realRezult = new ArrayList<>();
        realRezult.add(books.get(3));
        List bookExpected = bookLibrary.searchBookTitle(books, "soltane");
        if (realRezult.equals(bookExpected)) System.out.println("ok");
        else System.out.println("ne ok");
        }
    public void testSearchBookAuthor(List<Book> books) {
        BookLibrary bookLibrary = new BookLibrary();
        List realRezult = new ArrayList<>();
        realRezult.add(books.get(0));
        realRezult.add(books.get(1));
        realRezult.add(books.get(2));
        realRezult.add(books.get(3));
        List bookExpected = bookLibrary.searchBookAuthor(books, "puskin");
        if (realRezult.equals(bookExpected)) System.out.println("ok");
        else System.out.println("ne ok");
    }
    public void testBookRemove (List<Book> books){
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.deleteBook(books, "soltane", "puskin", 1817);
        int realRezult = 3;
        int expectedRezult = bookLibrary.howManyBooks(books);
        if (realRezult == expectedRezult) System.out.println("ok)) ");
        else System.out.println("ne ok");
    }
}

