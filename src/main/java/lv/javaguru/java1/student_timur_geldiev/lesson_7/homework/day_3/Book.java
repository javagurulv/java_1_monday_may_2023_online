package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_3;

class Book {
    String title;
    String author;
    int releaseYear;

    public Book(String title, String author, int releaseYear){
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getReleaseYear(){
        return releaseYear;
    }

}
