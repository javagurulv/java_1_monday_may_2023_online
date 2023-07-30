package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;


import java.util.ArrayList;
import java.util.List;

class BookLibrary {
    private List<Book> books = new ArrayList();

   public void addBook(Book book) { books.add(book); }

    public List<Book> findBooksByTitle(String bookTitleToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String title = book.getTitle();
            if (title.equals(bookTitleToSearch))
            {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> findBooksByAuthor(String bookAuthorToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String author = book.getAuthor();
            if (author.equals(bookAuthorToSearch))
            {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public int sumPagesByAuthor(String bookAuthorToSearch) {
        int pageCountByAuthor = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String author = book.getAuthor();
            if (author.equals(bookAuthorToSearch))
            {
               pageCountByAuthor += book.getPageCount();
            }
        }
        return pageCountByAuthor;
    }

    public int getBookCount() {
        return books.size();
    }

    public void removeBook(String title, String author, int year) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if ((book.getYear() == year) && (book.getTitle().equals(title)) && (book.getAuthor().equals(author)))
            {
                books.remove(book);
            }
        }
    }
}



