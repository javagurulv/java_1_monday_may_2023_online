package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_1;

public class Robot {

    String name; //задаем имя

    public Robot(String Name) {  //Задаем конструктор
        this.name = Name;
    }
    public String getName() { return name; }

    public void setName(String Name) {
        this.name = Name;
    }
}
