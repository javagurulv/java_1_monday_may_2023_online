package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_3;

public class BookDescription {
    private String name;
    private String author;
    private int yearIssue;
    private Chapter chapter1;
    private Chapter chapter2;

    public BookDescription (String name, String author, int yearIssue, Chapter chapter1, Chapter chapter2) {
    this.name = name;
    this.author = author;
    this.yearIssue = yearIssue;
    this.chapter1 = chapter1;
    this.chapter2 = chapter2;}

        public String getName () {return name;}
        public String getAuthor () {return author;}
        public int getYearIssue () {return yearIssue;}

}
