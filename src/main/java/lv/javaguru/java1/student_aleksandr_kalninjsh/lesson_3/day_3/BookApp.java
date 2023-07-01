package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_3;

import java.util.concurrent.Callable;

public class BookApp {

    public static void main(String[] args) {

        Book book1 = new Book("Tom Sawyer abroad.", "Mark Twain.", 1894);
        Chapter chapter1 = new Chapter("Tom seeks new adventures.", "DO you reckon Tom Sawyer was satisfied after all them adventures? I mean the adventures we had down the river, and the time we set the darky Jim free and Tom got shot in the leg.");
        Chapter chapter2 = new Chapter("The balloon ascension.", "WELL, Tom got up one thing after another, but they all had tender spots about ‘em somewheres, and he had to shove ‘em aside. ");

        System.out.println("Book one:");
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.yearOfIssue);
        System.out.println(chapter1.getTitle());
        System.out.println(chapter1.getChapterText());
        System.out.println(chapter2.getTitle());
        System.out.println(chapter2.getChapterText());

        Book book2 = new Book("Tarzan and the Golden Lion.", "Edgar Rice Burroughs.", 2019);
        Chapter chapter11 = new Chapter("THE GOLDEN LION.", "SABOR, the lioness, suckled her young—a single fuzzy ball, spotted like Sheeta, the leopard.");
        Chapter chapter22 = new Chapter("THE TRAINING OF JAD-BAL-JA.", "AND so Tarzan of the Apes, and Jane Clayton, and Korak came home after a long absence and with them came Jad-bal-ja, the golden lion, and Za, the bitch.");

        System.out.println("Book two:");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.yearOfIssue);
        System.out.println(chapter11.getTitle());
        System.out.println(chapter11.getChapterText());
        System.out.println(chapter22.getTitle());
        System.out.println(chapter22.getChapterText());



    }
}













