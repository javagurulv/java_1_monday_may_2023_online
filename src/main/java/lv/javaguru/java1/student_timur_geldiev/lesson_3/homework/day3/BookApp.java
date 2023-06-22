package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day3;

class BookApp {
    public static void main(String[] args) {
        Chapter chapter1OfBook1 = new Chapter("Chapter One", "To the red country and part of the gray country of Oklahoma, the last rains came\n" +
                "gently, and they did not cut the scarred earth.");
        Chapter chapter2OfBook1 = new Chapter("Chapter Two", "A huge red transport truck stood in front of the little roadside restaurant.");
        Book book1 = new Book("The Grapes of Wrath", "John Steinbeck", 1939, chapter1OfBook1, chapter2OfBook1);

        Chapter chapter1OfBook2 = new Chapter("I", "В начале июля, в чрезвычайно жаркое время, под вечер, один молодой человек вышел из своей каморки, которую нанимал от жильцов в С — м переулке, на улицу и медленно, как бы в нерешимости, отправился к К — ну мосту.");
        Chapter chapter2OfBook2 = new Chapter("II", "Раскольников не привык к толпе и, как уже сказано, бежал всякого общества, особенно в последнее время.");
        Book book2 = new Book("Преступление и наказание", "Фёдор Михайлович Достоевский", 1866, chapter1OfBook2, chapter2OfBook2);

        System.out.println("First book is " + book1.getName() + " by " + book1.getAuthor() + " released in " + book1.getReleaseYear());
        System.out.println("First chapter starts with: " + chapter1OfBook1.getChapterText());
        System.out.println("Second chapter starts with: " + chapter2OfBook1.getChapterText());

        System.out.println("Second book is " + book2.getName() + " by " + book2.getAuthor() + " released in " + book2.getReleaseYear());
        System.out.println("First chapter starts with: " + chapter1OfBook2.getChapterText());
        System.out.println("Second chapter starts with: " + chapter2OfBook2.getChapterText());

    }
}
