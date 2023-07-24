package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class BookLibraryTest {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(allBooks,"The Little Prince", "Antoine de Saint-Exupery", 1943, 50);
        bookLibrary.addBook(allBooks,"The Alchemist", "Paulo Coelho", 1988, 100);
        bookLibrary.addBook(allBooks,"Reach dad poor dad", "Robert Kiyosaki", 1998, 175);
        BookLibraryTest test = new  BookLibraryTest();
        test.testFindBookByTitle(allBooks);
        test.testFindBookByAuthor(allBooks);
        test.testSumPage(allBooks);
        test.testCountBooks(allBooks);
        test.testRemoveBook(allBooks);
    }

    public void testFindBookByTitle(List<Book> allBooks) {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = allBooks.get(0);
        List<Book> result = bookLibrary.findBookByTitle(allBooks, "The Little Prince");
        Book book2 = result.get(0);
        if (book2.getTitle().equals(book1.getTitle()))
        {
            System.out.println(": TEST OK!");
        } else {
            System.out.println(": TEST FAIL!");
        }
    }

    public void testFindBookByAuthor(List<Book> allBooks) {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = allBooks.get(0);
        List<Book> result = bookLibrary.findBookByAuthor(allBooks,"Antoine de Saint-Exupery");
        Book book2 = result.get(0);
        if (book2.getAuthor().equals(book1.getAuthor())) {
            System.out.println(": TEST OK!");
            } else {
            System.out.println(": TEST FAIL!");
            }
        }

    public void testSumPage(List<Book> allBooks) {
        int pageSum = 50;
        BookLibrary bookLibrary = new BookLibrary();
        int result = bookLibrary.sumPage(allBooks,"Antoine de Saint-Exupery");
        System.out.println("RESULT: " + result);
        if (result == pageSum) {
            System.out.println(": TEST OK!");
        } else {
            System.out.println(": TEST FAIL!");
        }
    }
    public void testCountBooks(List<Book> allBooks) {
        int BooksCount = 3;
        BookLibrary bookLibrary = new BookLibrary();
        int result = bookLibrary.countBooks(allBooks);
        System.out.println("RESULT: " + result);
        if (result == BooksCount) {
            System.out.println(": TEST OK!");
        } else {
            System.out.println(": TEST FAIL!");
        }
    }

    public void testRemoveBook(List<Book> allBooks) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.removeBook(allBooks, "The Alchemist", "Paulo Coelho", 1988);
        List<Book> result = bookLibrary.findBookByTitle(allBooks, "The Alchemist");
        if (result.size() == 0)
        {
            System.out.println(": TEST OK!");
        } else {
            System.out.println(": TEST FAIL!");
        }
    }


}











