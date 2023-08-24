package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_3;

class Book {

    String name;
    String author;
    int numberOfPages;
    int yearOfIssue;

    public Book(String name, String author, int numberOfPages, int yearOfIssue) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yearOfIssue = yearOfIssue;
    }
    String getName() {
        return name;
    }
    String getAuthor() {
        return author;
    }
    int getNumberOfPages() {
        return numberOfPages;
    }
    int getYearOfIssue() {
        return yearOfIssue;
    }


}
