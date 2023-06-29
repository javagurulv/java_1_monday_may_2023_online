package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day5;

//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Book.
public class Book {

    String title; //добавить кавычки

    Book(String bookTitle) {
        this.title = bookTitle; // название переменной аналонично со String
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

