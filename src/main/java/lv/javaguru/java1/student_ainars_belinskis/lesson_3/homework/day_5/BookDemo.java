package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_5;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
