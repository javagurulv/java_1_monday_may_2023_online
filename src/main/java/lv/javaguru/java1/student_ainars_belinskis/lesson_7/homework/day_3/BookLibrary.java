package lv.javaguru.java1.student_ainars_belinskis.lesson_7.homework.day_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BookLibrary {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> books = new ArrayList<>();

        books.add(new Book("Детектив Босх 1", "Майкл Коннелли1", 200, 2012));
        books.add(new Book("Детектив Босх 2", "Майкл Коннелли2", 300, 2014));
        books.add(new Book("Детектив Босх 3", "Майкл Коннелли3", 400, 2016));
        books.add(new Book("Детектив Босх 4", "Майкл Коннелли4", 500, 2016));


        bookLibrary.numberOfBooks(books);
        bookLibrary.numberOfBooks2(books);
        bookLibrary.findeBookTitle(books, "Детектив Босх 1");
        bookLibrary.findeBookAuthor(books, "Майкл Коннелли");
        bookLibrary.findeBookAuthorPageSum(books, "Майкл Коннелли");



    }


    public int numberOfBooks(List<Book> BooksNr) {
        int bookNumbers = Array.getLength(BooksNr.toArray());
        System.out.println("The total number of books in the library is: " + bookNumbers);
        return bookNumbers;
    }

    public int numberOfBooks2(List<Book> BookCount) {
        int count = BookCount.size();
        System.out.println("The total book number is: " + count);
        return count;
    }

    public List<Book> findeBookTitle(List<Book> findTitleFrom, String title) {
        List<Book> bookTitles = new ArrayList<>();
        for (int i = 0; i < findTitleFrom.size(); i++) {
            Book book = findTitleFrom.get(i);
            if (book.getBookTitle().equals(title)) {
                bookTitles.add(book);
                System.out.println("The book with title: " + book.getBookTitle() + ", " + book.getBookAuthor() + ", " + book.getNumberOfPages() + ", " + book.getYearOfIssue());
            }
        }
        return bookTitles;
    }

    public List<Book> findeBookAuthor(List<Book> findAuthorFrom, String author) {
        List<Book> bookAuthor = new ArrayList<>();
        for (int i = 0; i < findAuthorFrom.size(); i++) {
            Book book = findAuthorFrom.get(i);
            if (book.getBookAuthor().equals(author)) {
                bookAuthor.add(book);
                System.out.println("The book with author: " + book.getBookTitle() + ", " + book.getBookAuthor() + ", " + book.getNumberOfPages() + ", " + book.getYearOfIssue());
            }
        }
        return bookAuthor;
    }

    public int findeBookAuthorPageSum(List<Book> findAuthorFrom, String author) {
        int pageSum = 0;
        for (int i = 0; i < findAuthorFrom.size(); i++) {
            Book book = findAuthorFrom.get(i);
            if (book.getBookAuthor().equals(author)) {
                pageSum = pageSum + book.getNumberOfPages();
            }
            System.out.println("The sum of the pages of all books by the author " + author + ": " + pageSum);
        }
        return pageSum;
    }

    public int calculateAuthorPageCount(List<Book> books,
                                        String author) {
        List<Book> authorBooks = findBooksByAuthor(books, author);
        return calculatePageCount(authorBooks);
    }

    private List<Book> findBooksByAuthor(List<Book> books,
                                         String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getBookAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    private int calculatePageCount(List<Book> books) {
        int pageCount = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            pageCount += book.getNumberOfPages();
        }
        return pageCount;
    }

}