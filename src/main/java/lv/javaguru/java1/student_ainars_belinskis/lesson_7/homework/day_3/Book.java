package lv.javaguru.java1.student_ainars_belinskis.lesson_7.homework.day_3;

class Book {
    String bookTitle;
    String bookAuthor;
    int yearOfIssue;
    int numberOfPages;

    public Book(String bookTitle, String bookAuthor, int numberOfPages, int yearOfIssue) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.numberOfPages = numberOfPages;
        this.yearOfIssue = yearOfIssue;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

}
