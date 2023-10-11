package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Sherlock Holmes" , "Arthur Conan Doyle", 1887);
        Book book2 = new Book("Master and Margarita" , "Mikhail Bulgakov", 1967);
        Book book3 = new Book("Captain Blood" , "Rafael Sabatini", 1922);


    List<Book> books = new ArrayList<>();
        int size = books.size();

        books.add(book1);
        books.add(book2);
        books.add(book3);
    }
}


