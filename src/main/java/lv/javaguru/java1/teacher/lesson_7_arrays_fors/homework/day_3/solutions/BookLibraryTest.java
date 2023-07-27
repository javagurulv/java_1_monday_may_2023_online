package lv.javaguru.java1.teacher.lesson_7_arrays_fors.homework.day_3.solutions;

import java.util.List;

class BookLibraryTest {

    public static void main(String[] args) {
        BookLibraryTest test = new BookLibraryTest();
        test.shouldReturnZeroWhenLibraryIsEmpty();
        test.shouldReturnBookCountWhenLibraryIsNotEmpty();
        test.shouldFoundZeroBooksWhenLibraryIsEmpty();
        test.shouldFoundOneBook();
        test.shouldFoundBooks();
    }

    public void shouldReturnZeroWhenLibraryIsEmpty() {
        BookLibrary bookLibrary = new BookLibrary();
        int bookCount = bookLibrary.getBookCount();
        checkResult(bookCount, 0, "shouldReturnZeroWhenLibraryIsEmpty");
    }

    public void shouldReturnBookCountWhenLibraryIsNotEmpty() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("War and peace", "Dostoevsky", 1820);
        bookLibrary.addBook(book);
        int bookCount = bookLibrary.getBookCount();
        checkResult(bookCount, 1, "shouldReturnBookCountWhenLibraryIsNotEmpty");
    }

    public void shouldFoundZeroBooksWhenLibraryIsEmpty() {
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> foundBooks = bookLibrary.findBooksByTitle("War");
        checkResult(foundBooks.size(), 0, "shouldFoundZeroBooksWhenLibraryIsEmpty");
    }

    public void shouldFoundOneBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("War and peace", "Dostoevsky", 1820);
        bookLibrary.addBook(book);
        List<Book> foundBooks = bookLibrary.findBooksByTitle("War and peace");
        checkResult(foundBooks.size(), 1, "shouldFoundOneBook");
    }

    public void shouldFoundBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book("War and peace", "Dostoevsky", 1820);
        bookLibrary.addBook(book1);
        Book book2 = new Book("War and peace", "Dostoevsky", 1820);
        bookLibrary.addBook(book2);
        List<Book> foundBooks = bookLibrary.findBooksByTitle("War and peace");
        checkResult(foundBooks.size(), 2, "shouldFoundBooks");
    }


    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
