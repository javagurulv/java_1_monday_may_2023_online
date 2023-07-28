package lv.javaguru.java1.student_ainars_belinskis.lesson_7.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class BookLibraryTest {
    public static void main(String[] args) {
        BookLibraryTest test = new BookLibraryTest();
        test.numberOfBooksTest();
        test.numberOfBooks2Test();
    }
    public void numberOfBooksTest(){
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> books = new ArrayList<>();
        books.add(new Book("Detektive1", "Mikle", 2010, 345));
        books.add(new Book("Detektive2", "John", 2012, 333));
        int result = bookLibrary.numberOfBooks(books);
        checkResult(result, 2,"numberOfBooks");
    }

    public void numberOfBooks2Test(){
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> booksNr = new ArrayList<>();
        booksNr.add(new Book("Detektive1", "Mikle", 2010, 345));
        booksNr.add(new Book("Detektive2", "John", 2012, 333));
        int result = bookLibrary.numberOfBooks2(booksNr);
        checkResult(result, 2,"numberOfBooks2");
    }
  /*  public void findeBookTitleTest(){
        BookLibrary bookLibrary = new BookLibrary();
        String expectedResult = "Detektive1";
        List<Book> findTitle = new ArrayList<>();
        findTitle.add(new Book("Detektive1", "Mikle", 2010, 345));
        findTitle.add(new Book("Detektive2", "John", 2012, 333));
        String result = bookLibrary.findeBookTitle(findTitle,"Detektive1");
        checkResult2(result, expectedResult,"findeBookTitleTest");
    } */

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK! The total number of books is correct!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
    private void checkResult2(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK! This title has been found!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
