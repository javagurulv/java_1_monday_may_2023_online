package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_3;

class Book {

    String bookName;
    String bookAuthor;
    int yearPublished;

    public Book (String bookName, String bookAuthor, int yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }

    public String getBookName() {return bookName;}
    public String getBookAuthor() {return bookAuthor;}
    public int getYearPublished() {return yearPublished;}



}
