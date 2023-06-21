package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day3;

public class Book {

    String name;
    String author;
    int releaseYear;
    Chapter chapter1;
    Chapter chapter2;

    public Book(String name, String author, int releaseYear, Chapter chapter1, Chapter chapter2){
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

}
