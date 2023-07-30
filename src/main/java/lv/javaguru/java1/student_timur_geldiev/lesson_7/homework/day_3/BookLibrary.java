package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookLibrary {

    public static void main(String[] args) {

        Book book1 = new Book("The Grapes of Wrath", "John Steinbeck", 1939);
        Book book2 = new Book("Generation П", "Viktor Pelevin", 1999);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);


        BookLibrary test = new BookLibrary();
        test.checkAmountOfBooks(books);
        test.checkFindBookName(books);
        test.checkFindAuthor(books);
        test.checkDeleteBookByTitle(books);
        test.checkDeleteBookByAuthor(books);


    }

    // Лучше public List<Book> findBooksByTitle(List<Book> bookList, String bookTitle) {
    public List<Book> findBookName(List<Book> bookList, String bookTitle) {
        List<Book> foundBook = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getTitle().equals(bookTitle)) {
                foundBook.add(book);

            }
        }
        return foundBook;

    }

    public List<Book> findBookByAuthor(List<Book> bookList, String authorName) {
        List<Book> foundAuthor = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getAuthor().equals(authorName)) {
                foundAuthor.add(book);

            }
        }
        return foundAuthor;

    }

    public List<Book> deleteBookByTitle(List<Book> bookList, String bookTitle) {
        List<Book> deleteBooks = new ArrayList<>(bookList);
        Iterator<Book> iterator = deleteBooks.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(bookTitle)) {
                iterator.remove();
            }
        }
        return deleteBooks;
    }

    public List<Book> deleteBookByAuthor(List<Book> bookList, String authorName) {
        List<Book> deleteBooks = new ArrayList<>(bookList);
        Iterator<Book> iterator = deleteBooks.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equals(authorName)) {
                iterator.remove();
            }
        }
        return deleteBooks;
    }


    public void checkAmountOfBooks(List<Book> books) {
        int expected = 2;
        int actual = books.size();
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public void checkFindBookName(List<Book> books) {
        String expected = "Generation П";
        List<Book> foundBooks = findBookName(books, "Generation П");
        boolean found = false;
        for (int i = 0; i < foundBooks.size(); i++) {
            Book book = foundBooks.get(i);
            if (book.getTitle().equals(expected)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public void checkFindAuthor(List<Book> books) {
        String expected = "John Steinbeck";
        List<Book> foundAuthor = findBookByAuthor(books, "John Steinbeck");
        boolean found = false;
        for (int i = 0; i < foundAuthor.size(); i++) {
            Book book = foundAuthor.get(i);
            if (book.getAuthor().equals(expected)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public void checkDeleteBookByTitle(List<Book> books) {
        boolean notFound = true;
        List<Book> bookList = findBookName(books, "The Grapes of Wrath");
        List<Book> updatedBooks = deleteBookByTitle(bookList, "The Grapes of Wrath");
        for (int i = 0; i < updatedBooks.size(); i++) {
            Book book = updatedBooks.get(i);
            if (book.getTitle().equals("The Grapes of Wrath")) {
                notFound = false;
            }
        }
        if (notFound) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public void checkDeleteBookByAuthor(List<Book> books) {
        boolean notFound = true;
        List<Book> bookList = findBookByAuthor(books, "John Steinbeck");
        List<Book> updatedBooks = deleteBookByAuthor(bookList, "John Steinbeck");
        for (int i = 0; i < updatedBooks.size(); i++) {
            Book book = updatedBooks.get(i);
            if (book.getAuthor().equals("John Steinbeck")) {
                notFound = false;
            }
        }
        if (notFound) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}


