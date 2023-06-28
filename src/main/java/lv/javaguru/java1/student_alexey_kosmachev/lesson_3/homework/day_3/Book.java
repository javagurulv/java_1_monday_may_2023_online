package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_3;

import java.time.Year;

public class Book {

    String name;   //название книги
    String author;  //автор книги
    int year; // год издания книги
    Chapter chapter1; // первая глава
    Chapter chapter2; //вторая глава

    public Book(String Name, String Author, int Year, Chapter chapter1, Chapter chapter2) {
        this.name = Name;
        this.author = Author;
        this.year = Year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    }


