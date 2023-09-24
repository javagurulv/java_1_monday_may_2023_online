package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_5.homework.day_1;

public class CollorDetector {
    public String WaweLenght(int lenght) {
        if (lenght >= 380 && lenght <= 449) {
            return "Violet";
        } else if (lenght >= 450 && lenght <= 499) {
            return "Blue";
        } else if (lenght >= 495 && lenght <= 569) {
            return "Green";
        } else if (lenght >= 570 && lenght <= 589) {
            return "Yellow";
        } else if (lenght >= 590 && lenght <= 619) {
            return "Orange";
        } else if (lenght >= 620 && lenght <= 750) {
            return "Red";
        } else {
            return "Invisible light";}
    }
}