package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day3;

public class BookApp {
    public static void main(String[] args) {

        BookChapter1 chapter1Book1 = new BookChapter1(" home ", " Chapter text 0000000 ");
        BookChapter1 chapter2Book1 = new BookChapter1(" maade ", " Chapter text 11111 ");
        BookChapter2 chapter1Book2 = new BookChapter2(" week ", " Chapter text 222222 ");
        BookChapter2 chapter2Book2 = new BookChapter2(" table ", " Chapter text 3333330 ");


        Book book1 = new Book(" Capitan ", " Puskin ", 1830);
        Book book2 = new Book(" Gamer ", " Dostoevskiy ", 1810);
        System.out.println("First book");
        System.out.println("Name: " +   book1.getName() +  "\nWriter: " + book1.getAuthor() + "\nyear: " + book1.getYear());
        System.out.println("Chapter1 name:" + chapter1Book1.getName() +"\nchapter1 text:" + chapter1Book1.getText());
        System.out.println("Chapter2 name:" + chapter2Book1.getName() + "\nchapter2 text:" +chapter2Book1.getText());
        System.out.println();
        System.out.println("Second book");
        System.out.println("Name: " + book2.getName() + "\nWriter: " + book2.getAuthor() + "\nyear: " + book2.getYear());
        System.out.println("Chapter1 name:" + chapter1Book2.getName() + "\nchapter1 text:" + chapter1Book2.getText());
        System.out.println("Chapter2 name:" +chapter2Book2.getName() + "\nchapter2 text:" + chapter2Book2.getText());

    }
}