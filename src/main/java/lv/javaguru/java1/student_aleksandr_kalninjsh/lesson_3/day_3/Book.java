package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_3;

public class Book {

    String name;
    String author;
    int yearOfIssue;


    public Book(String name, String author, int yearOfIssue) {
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearOfIssue() {
        return  yearOfIssue;
    }
}
