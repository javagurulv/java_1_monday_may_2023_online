package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_1;

class ColourOfWaveDetector {

    public String lenghtwave (int number) {
        if (number >= 380 && number <= 449 ) return "Фиолетовый (Violet)";
        else if (number >= 450 && number <= 494 ) return "Синий (Blue)";
        else if (number >= 495 && number <= 569 ) return "Зеленый (Green)";
        else if (number >= 570 && number <= 589 ) return "Желтый (Yellow)";
        else if (number >= 590 && number <= 619 ) return "Оранжевый (Orange)";
        else if (number >= 620 && number <= 750 ) return "Красный (Red)";
        else return "Невидимый спектр (Invisible Light)";
    }
}
