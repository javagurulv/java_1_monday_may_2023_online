package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_3.homework.day_3;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Эрагон", "Alfred A. Knopf", 2003);
        Chapter book1chapter1 = new Chapter("Открытие", "Эрагон опустился на колени: жесткая примятая трава явственно свидетельствовала, что олени были здесь, на лугу, всего полчаса назад.");
        Chapter book1chapter2 = new Chapter("Долина Паланкар", "Утром все вокруг было залито победоносным золотистым светом.");
        Book book2 = new Book("Белый клык", "Джек лондон", 1906);
        Chapter book2chapter1 = new Chapter("Погоня за добычей", "Тёмный еловый лес стоял, нахмурившись, по обоим берегам скованной льдом реки.");
        Chapter book2chapter2 = new Chapter("Волчица", "Позавтракав и уложив в сани свои скудные пожитки, Билл и Генри покинули приветливый костёр и двинулись в темноту.");
        System.out.println("Первая книга: ");
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        System.out.println(book1chapter1.getTitle());
        System.out.println(book1chapter1.getChaptersText());
        System.out.println(book1chapter2.getTitle());
        System.out.println(book1chapter2.getChaptersText());
        System.out.println("Вторая книга: ");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYear());
        System.out.println(book2chapter1.getTitle());
        System.out.println(book2chapter1.getChaptersText());
        System.out.println(book2chapter2.getTitle());
        System.out.println(book2chapter2.getChaptersText());
    }
}