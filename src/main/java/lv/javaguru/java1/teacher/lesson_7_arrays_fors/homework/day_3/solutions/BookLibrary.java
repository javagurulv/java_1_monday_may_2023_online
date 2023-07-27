package lv.javaguru.java1.teacher.lesson_7_arrays_fors.homework.day_3.solutions;

import java.util.ArrayList;
import java.util.List;

class BookLibrary {

    private List<Book> books = new ArrayList();

    public void addBook(Book book) {
        books.add(book);
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> findBooksByTitle(String bookTitleToSearch) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String title = book.getTitle();
            if (title.equals(bookTitleToSearch)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

}
