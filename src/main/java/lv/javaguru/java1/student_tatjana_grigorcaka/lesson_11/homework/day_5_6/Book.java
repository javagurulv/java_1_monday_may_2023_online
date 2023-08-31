package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_5_6;


public class Book {

    private String title;
    private String author;

    private boolean isRead = false;


    public Book(String title, String author, boolean isRead) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isRead(boolean b) {
        return true;
    }
}
