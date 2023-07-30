package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;

class Book {

    private String title;
    private String author;
    private int year;
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public int getPageCount() { return pageCount; }


}
