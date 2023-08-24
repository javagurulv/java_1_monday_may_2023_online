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
    public void booksQuantity(List<Book>books) {
        int realdResult = 2;
        int actualResult = books.size();
        if (actualResult == realdResult) {
            System.out.println("Book quantity test = OK");
        }
        else {
            System.out.println("Book quantity test = FAIL");
        }


    }
    public void bookSearchByTitle(List<Book>books) {
        BookLibrary bookLibrary = new BookLibrary();
        String name = "Tom Sawyer abroad";
        List<Book>book1 = bookLibrary.bookSearchByTitle("Tom Sawyer abroad");
        boolean scan = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name)) {
                scan = true;
            }
        }
        if (scan) {
            System.out.println("Book search by title test = OK");
        }
        else {
            System.out.println("Book search by title test = FAIL");
        }
    }
    public void bookSearchByAuthor(List<Book>books) {
        BookLibrary bookLibrary = new BookLibrary();
        String author = "Edgar Rice Burroughs";
        List<Book>book2 = bookLibrary.bookSearchByAuthor("Edgar Rice Burroughs");
        boolean scan = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                scan = true;
            }
        }
        if (scan) {
            System.out.println("Book search by author test = OK");
        }
        else {
            System.out.println("Book search by author test = FAIL");
        }
    }
    public void pageCountByAuthor(List<Book>books) {
        public void pageCountByAuthor(List<Book>books) {
            BookLibrary bookLibrary = new BookLibrary();
            int realResult = 270;
            int expectedResult = bookLibrary.pageCountByAuthor("");
            if (realResult == expectedResult) {
                System.out.println("Page count by author test = OK");
            }
            else {
                System.out.println("Page count by author test = FAIL");
            }
        }

    }



}
