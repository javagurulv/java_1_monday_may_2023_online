package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;

class Book {

    private String title;
    private String author;
    private int year;
    private int page;

    public Book(String title, String author, int year, int page) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.page = page;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public int getPage() { return page; }


}
