package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day5;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}


    class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }


