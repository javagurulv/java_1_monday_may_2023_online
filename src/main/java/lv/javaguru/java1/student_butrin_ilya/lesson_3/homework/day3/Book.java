package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day3;

public class Book {
    String name;
    String author;
    int year;

    BookChapter chapter1;
    BookChapter chapter2;

    public Book (String name, String author, int year, BookChapter chapter1, BookChapter chapter2) {

        this.name = name;
        this.author = author;
        this.year = year;
       this.chapter1=chapter1;
       this.chapter2=chapter2;

    }
    public String getName () {
        return name;
    }
    public String getAuthor () {
        return author;
    }
    public int getYear () {
        return year;
    }
}
