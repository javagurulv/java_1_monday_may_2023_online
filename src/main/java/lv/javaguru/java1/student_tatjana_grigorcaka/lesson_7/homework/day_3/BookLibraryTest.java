package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;


import java.util.List;

class BookLibraryTest {
    public static void main(String[] args) {

        BookLibraryTest test = new  BookLibraryTest();
        test.testFoundOneBookByTitle();
        test.testFoundOneBookByAuthor();
        test.testSumPagesByAuthor();
        test.testCountBooks();
        test.testRemoveBook();
    }

    public void testFoundOneBookByTitle() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943, 50);
        bookLibrary.addBook(book);
        List<Book> foundBooks = bookLibrary.findBooksByTitle("The Little Prince");
        checkResult(foundBooks.size(), 1, "testFoundOneBookByTitle");
    }

    public void testFoundOneBookByAuthor() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943, 50);
        bookLibrary.addBook(book);
        List<Book> foundBooks = bookLibrary.findBooksByAuthor("Antoine de Saint-Exupery");
        checkResult(foundBooks.size(), 1, "testFoundOneBookByAuthor");
    }


    public void testSumPagesByAuthor() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943, 50);
        bookLibrary.addBook(book);
        int pageCount = bookLibrary.sumPagesByAuthor("Antoine de Saint-Exupery");
        checkResult(pageCount, 50, "testSumPagesByAuthor");
    }


    public void testCountBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943, 50);
        bookLibrary.addBook(book1);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 1988, 100);
        bookLibrary.addBook(book2);
        Book book3 = new Book("Reach dad poor dad", "Robert Kiyosaki", 1998, 175);
        bookLibrary.addBook(book3);
        int bookCount = bookLibrary.getBookCount();
        checkResult(bookCount, 3, "testCountBooks");

    }

    public void testRemoveBook() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.removeBook( "The Alchemist", "Paulo Coelho", 1988);
        List<Book> foundBooks = bookLibrary.findBooksByTitle( "The Alchemist");
        checkResult(foundBooks.size(), 0, "testRemoveBook");
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











