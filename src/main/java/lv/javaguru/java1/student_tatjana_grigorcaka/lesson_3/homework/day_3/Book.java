package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_3;

class Book {

    private String name;
    private String author;
    private String yearIssue;
    private String chapterOne;
    private String chapterTwo;

    public Book (String name, String author, String yearIssue, String chapterOne, String chapterTwo) {
        this.name = name;
        this.author = author;
        this.yearIssue = yearIssue;
        this.chapterOne = chapterOne;
        this.chapterTwo = chapterTwo;
    }
    public String getName() {return name;}
    public String getAuthor() {return author;}
    public String getYearIssue() {return yearIssue;}


}
