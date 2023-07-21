package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day3;

public class Book {
    String name;

    String author;
    int year;
    int page;

    public Book(String name, String author, int year, int page) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPage() {
        return page;
    }
}
