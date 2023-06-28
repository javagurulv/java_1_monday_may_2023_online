package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_3;

public class BookApp {
    public static void main(String[] args) {
        Chapter book1chapter1 = new Chapter("Начало", "Это книга обо всем хорошем, против всего плохого");
        Chapter book1chapter2 = new Chapter("Конец", "Наши всех победили");
        Book book1 = new Book("Aelita", "Alexey Tolstoy", 1923, book1chapter1, book1chapter2);

        Chapter book2chapter1 = new Chapter("Об этой книге", "Прочитай об искусстве интриги");
        Chapter book2chapter2 = new Chapter("Заключение", "Теперь ты понял все");
        Book book2 = new Book("Gosudar", "Niccolo Makiavelli", 1515, book2chapter1, book2chapter2);

        System.out.println("Первая книга: ");
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        System.out.println(book1chapter1.getChapterName());
        System.out.println(book1chapter1.getChapterText());
        System.out.println(book1chapter2.getChapterName());
        System.out.println(book1chapter2.getChapterText());
        System.out.println();
        System.out.println("Вторая книга: ");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYear());
        System.out.println(book2chapter1.getChapterName());
        System.out.println(book2chapter1.getChapterText());
        System.out.println(book2chapter2.getChapterName());
        System.out.println(book2chapter2.getChapterText());




    }
}
