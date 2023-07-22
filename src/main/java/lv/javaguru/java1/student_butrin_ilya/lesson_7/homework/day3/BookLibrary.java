package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class BookLibrary {
    public void addBook(List<Book> books, String name, String author, int year, int page) {
        books.add(new Book(name, author, year, page));
    }
    public int howManyBooks(List<Book> howMany) {
        int howManyBooks = howMany.size();
        return howManyBooks;
    }
        public List<Book> searchBookTitle(List<Book> search, String title) {
        List<Book> rezult = new ArrayList<>();
            for (int i = 0; i < search.size(); i++) {
                Book book = search.get(i);
                String nameOfBook = book.getName();
                if (nameOfBook.equals(title)) {
                    rezult.add(book);}
                }
            return rezult;
        }
    public List<Book> searchBookAuthor(List<Book> search, String author) {
        List<Book> rezult = new ArrayList<>();
        for (int i = 0; i < search.size(); i++) {
            Book book = search.get(i);
            String nameOfBook = book.getAuthor();
            if (nameOfBook.equals(author)) {
                rezult.add(book);}
        }
        return rezult;
    }
    public int pageSum (List<Book> book, String author){
        int summa = 0;
        for (int i = 0; i < book.size(); i++){
           Book books = book.get(i);
           String authorBook = books.getAuthor();
           if (authorBook.equals(author)) {
               summa = summa + books.getPage();
           }
           }
               return summa;
        }
  public void deleteBook (List<Book> books, String title, String author, int year) {
      for(int i = 0; i < books.size(); i++){
          Book book = books.get(i);
          if((book.getYear() == year) && (book.getName().equals(title)) && (book.getAuthor().equals(author))){
          books.remove(book);}
      }
    }
    }