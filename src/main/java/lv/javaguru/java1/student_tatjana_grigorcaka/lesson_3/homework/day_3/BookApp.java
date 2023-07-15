package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_3;

class BookApp {

    public static void main(String[] args) {
        Book bookOne = new Book("The Little Prince", "Antoine de Saint-Exupery","1943", "Book 1 Chapter 1", "Book 1 Chapter 2");
        Book bookTwo = new Book ("The Alchemist", "Paulo Coelho", "1988", "Book 2 Chapter 1", "Book 2 Chapter 2");

        Chapter bookOneChapterOne = new Chapter("Book 1 Chapter 1 Chapter Name", "Book 1 Chapter 1 Chapter Text");
        Chapter bookOneChapterTwo = new Chapter("Book 1 Chapter 2 Chapter Name", "Book 1 Chapter 2 Chapter Text");
        Chapter bookTwoChapterOne = new Chapter("Book 2 Chapter 1 Chapter Name", "Book 2 Chapter 1 Chapter Text");
        Chapter bookTwoChapterTwo = new Chapter("Book 2 Chapter 2 Chapter Name", "Book 2 Chapter 2 Chapter Text");

        System.out.println("Book 1: ");
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getYearIssue());
        System.out.println(bookOneChapterOne.getChapterName());
        System.out.println(bookOneChapterOne.getChapterText());
        System.out.println(bookOneChapterTwo.getChapterName());
        System.out.println(bookOneChapterTwo.getChapterText());

        System.out.println("Book 2: ");
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getAuthor());
        System.out.println(bookTwo.getYearIssue());
        System.out.println(bookTwoChapterOne.getChapterName());
        System.out.println(bookTwoChapterOne.getChapterText());
        System.out.println(bookTwoChapterTwo.getChapterName());
        System.out.println(bookTwoChapterTwo.getChapterText());
    }

}
