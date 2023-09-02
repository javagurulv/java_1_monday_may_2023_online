package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_3.homework.day_3;

public class Book {
        String name;
        String author;
        int year;
        public Book(String Name, String Author, int Year) {
            this.name = Name;
            this.author = Author;
            this.year = Year;
        }
        public String getName() {
            return name;
        }
        public String getAuthor() {
            return author;
        }
        public int getYear() {
            return year;
        }
}