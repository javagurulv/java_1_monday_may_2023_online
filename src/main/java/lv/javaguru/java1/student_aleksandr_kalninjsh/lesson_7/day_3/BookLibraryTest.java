package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_3;


import java.util.ArrayList;
import java.util.List;

class BookLibraryTest {

    public static void main(String[] args) {

        Book book1 = new Book("Tom Sawyer abroad", "Mark Twain", 270, 1894);
        Book book2 = new Book("Tarzan and the Golden Lion", "Edgar Rice Burroughs", 350, 2019);
        List<Book>book = new ArrayList<>();
        book.add(book1);
        book.add(book2);


        BookLibraryTest bookLibraryTest = new BookLibraryTest();
        bookLibraryTest.booksQuantity(book);
        bookLibraryTest.bookSearchByTitle(book);
        bookLibraryTest.bookSearchByAuthor(book);
        bookLibraryTest.pageCountByAuthor(book);

    }
    public void booksQuantity(List<Book> books) {
        BookLibrary bookLibrary = new BookLibrary(books);
        int realResult = 2;
        int actualResult = bookLibrary.booksQuantity();
        if (actualResult == realResult) {
            System.out.println("Book quantity test = OK");
        }
        else {
            System.out.println("Book quantity test = FAIL");
        }
    }

    public void bookSearchByTitle(List<Book> books) {
        BookLibrary bookLibrary = new BookLibrary(books);
        List<Book> foundBooks = bookLibrary.bookSearchByTitle("Tom Sawyer abroad");
        if (foundBooks.size() == 1
                && foundBooks.get(0).getName().equals("Tom Sawyer abroad")) {
            System.out.println("Book search by title test = OK");
        }
        else {
            System.out.println("Book search by title test = FAIL");
        }
    }
    public void bookSearchByAuthor(List<Book> books) {
        BookLibrary bookLibrary = new BookLibrary(books);
        List<Book> foundBooks = bookLibrary.bookSearchByAuthor("Edgar Rice Burroughs");
        if (foundBooks.size() == 1
            && foundBooks.get(0).getAuthor().equals("Edgar Rice Burroughs")) {
            System.out.println("Book search by author test = OK");
        }
        else {
            System.out.println("Book search by author test = FAIL");
        }
    }
    public void pageCountByAuthor(List<Book>books) {
        BookLibrary bookLibrary = new BookLibrary(books);
        int realResult = 270;
        int expectedResult = bookLibrary.pageCountByAuthor("Mark Twain");
        if (realResult == expectedResult) {
            System.out.println("Page count by author test = OK");
        }
        else {
            System.out.println("Page count by author test = FAIL");
        }
    }

}
