package lv.javaguru.java1.student_butrin_ilya.lesson_11.day5and6;

public class demo {
    public static void main(String[] args) {
        Book KapDoch = new Book("Kapitanskaya Dochka", "Puskin", 1870);
        Book igrok = new Book("Igrok", "Dostoevskiy", 1790);
        Book mtciri = new Book("mtciri", "Lermontov", 1870);
        Book mufta = new Book("mufta", "", 1770);
        Book smert = new Book("", "komenskaja", 1990);
        BookReaderImpl books = new BookReaderImpl();
        books.addBook(igrok);
        books.addBook(smert);
        books.addBook(mufta);
        books.addBook(mtciri);
        books.deleteBook(mufta);
        books.deleteBook(KapDoch);
        books.allList();
        }
    }

