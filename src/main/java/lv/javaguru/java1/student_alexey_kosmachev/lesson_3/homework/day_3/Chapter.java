package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_3;

public class Chapter {

    String chapterName; //Название главы
    String chapterText; //Текст главы

    public Chapter(String ChapterName, String ChapterText) { //создаем конструктор
        this.chapterName = ChapterName;
        this.chapterText = ChapterText;
    }

    public String getChapterName() { return chapterName; }
    public String getChapterText() { return chapterText; }
}
