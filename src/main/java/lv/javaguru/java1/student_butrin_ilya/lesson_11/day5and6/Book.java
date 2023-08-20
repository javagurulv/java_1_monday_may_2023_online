package lv.javaguru.java1.student_butrin_ilya.lesson_11.day5and6;

public class Book {
    String title;
    String author;
    int year;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
