package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_3;
class BookApp {
    public static void main(String[] args) {
        Chapter bookOneCh1 = new Chapter("Book1 Ch1 name", "Bk1 Ch1 text!!!");
        Chapter bookOneCh2 = new Chapter("Book1 Ch2 name", "Bk1 Ch2 text!!!");
        Chapter bookTwoCh1 = new Chapter("Book2 Ch1 name", "Bk2 Ch1 text!!!");
        Chapter bookTwoCh2 = new Chapter("Book2 Ch2 name", "Bk2 Ch2 text!!!");

        BookDescription book1 = new BookDescription("Book1 Name!!!", "Mikle Konnely", 2020, bookOneCh1, bookOneCh2);
        BookDescription book2 = new BookDescription("Book2 Name!!!", "Aleks Mihaelides", 2022, bookTwoCh1, bookTwoCh2);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYearIssue());
        System.out.println(bookOneCh1.getChapterName());
        System.out.println(bookOneCh1.getChapterText());
        System.out.println(bookOneCh2.getChapterName());
        System.out.println(bookOneCh2.getChapterText());
        System.out.println("");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYearIssue());
        System.out.println(bookTwoCh1.getChapterName());
        System.out.println(bookTwoCh1.getChapterText());
        System.out.println(bookTwoCh2.getChapterName());
        System.out.println(bookTwoCh2.getChapterText());
    }

}
