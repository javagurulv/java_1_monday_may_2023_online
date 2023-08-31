package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5_6;



import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private List<Book> books = new ArrayList();

    Book[] booksArray = {
            new Book("The Little Prince", "Antoine de Saint-Exupery", false),
            new Book("The Alchemist", "Paulo Coelho", false),
            new Book("Reach dad poor dad", "Robert Kiyosaki", false),
    };

    Book[] readBooksArray = {
            new Book("The Little Prince", "Antoine de Saint-Exupery", true),
            new Book("The Alchemist", "Paulo Coelho", true),

    };

    Book[] notReadBooksArray = {
            new Book("Reach dad poor dad", "Robert Kiyosaki", false),
    };


    @Override
    public boolean addBook(Book book) {
        if (book.getAuthor().isEmpty() || book.getTitle().isEmpty()) {
            return false;
        }
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }


    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Book getAllBooks() {
        for (Book book : booksArray) {
            System.out.println("All Books:" + book.getTitle() + " " + book.getAuthor());
        }
        return null;
    }


    @Override
    public List<Book> findBooksByAuthor(String bookAuthorToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(bookAuthorToSearch)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findBooksByAuthorPrefix(String prefix) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().startsWith(prefix)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findBooksByTitle(String bookTitleToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(bookTitleToSearch)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findBooksByTitlePrefix(String prefix) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().startsWith(prefix)) {
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;
    }

    @Override
    public boolean isRead(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (!book.getAuthor().equals(books.get(i).getAuthor()) && !book.getTitle().equals(books.get(i).getTitle())) {
                return false;
            }
        }
        book.setRead(true);
        return true;
    }

    @Override
    public boolean isNotRead(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (!book.getAuthor().equals(books.get(i).getAuthor()) && !book.getTitle().equals(books.get(i).getTitle())) {
                return false;
            }
        }
        book.setRead(false);
        return true;
    }

    public Book[] getAllReadBooks() {
        for (Book book : readBooksArray) {
            System.out.println("All Read Books:" + book.getTitle() + " " + book.getAuthor() + book.isRead(true));
        }
        return null;
    }

    public Book[] getAllNotReadBooks() {
        for (Book book : notReadBooksArray) {
            System.out.println("All Not Read Books:" + book.getTitle() + " " + book.getAuthor() + book.isRead(false));
        }
        return null;
    }

}

