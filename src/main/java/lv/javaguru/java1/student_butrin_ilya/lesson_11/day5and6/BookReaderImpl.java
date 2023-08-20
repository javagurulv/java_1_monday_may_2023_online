package lv.javaguru.java1.student_butrin_ilya.lesson_11.day5and6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean addBook(Book book) {
        boolean check = checkAuthorAndTitle(book);
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) ||
                    book.getTitle().equals(books.get(i).getTitle()) ||
                    check == false) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public boolean checkAuthorAndTitle(Book book) {
        if (book.getAuthor().equals("") || book.getTitle().equals(""))
            return false;
        else return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        List<Book> booksList = getBooks();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getTitle().equals(book.getTitle()) && booksList.get(i).getAuthor().equals(book.getAuthor())) {
                booksList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] allList() {
        String[] alllist = new String[books.size()];
        {
            for (int i = 0; i < alllist.length; i++) {
                String list = books.get(i).getTitle() + "[" + books.get(i).getAuthor() + "]";
                alllist[i] = list;
            }
            return alllist;
        }
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> onlyOneAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                onlyOneAuthor.add(books.get(i));
            }
        }
        return onlyOneAuthor;
    }

    @Override
    public List<Book> findByPrefix(String prefix) {
        List<Book> onlyOneAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().startsWith(prefix)) {
                onlyOneAuthor.add(books.get(i));
            }
        }
        return onlyOneAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> onlyTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title) || books.get(i).getTitle().startsWith(title)) {
                onlyTitle.add(books.get(i));
            }
        }
        return onlyTitle;
    }

    @Override
    public boolean bookIsReaded(Book book) {
        List<Book> isReaded = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                isReaded.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean bookIsNoReaded(Book book) {
        List<Book> isNoReaded = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (book.getAuthor().equals(books.get(i).getAuthor()) && book.getTitle().equals(books.get(i).getTitle())) {
                isNoReaded.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getReadedList() {
        List<Book> readedList = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (bookIsReaded(books.get(i)) == true) {
                {
                    readedList.add(books.get(i));
                }
            }
        }
        String[] readList = new String[readedList.size()];
        for (int i = 0; i < readedList.size(); i++) {
            String book = readedList.get(i).getTitle() + "[" + readedList.get(i).getAuthor() + "]";
            readList[i] = book;
        }
        return readList;
    }

    @Override
    public String[] getNoReadedList() {
        List<Book> NoreadedList = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (bookIsNoReaded(books.get(i)) == true) {
                {
                    NoreadedList.add(books.get(i));
                }
            }
        }
        String[] NoreadList = new String[NoreadedList.size()];
        for (int i = 0; i < NoreadedList.size(); i++) {
            String book = NoreadedList.get(i).getTitle() + "[" + NoreadedList.get(i).getAuthor() + "]";
            NoreadList[i] = book;
        }
        return NoreadList;
    }
}