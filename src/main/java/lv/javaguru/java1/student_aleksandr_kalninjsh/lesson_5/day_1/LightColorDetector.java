package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_5.day_1;

class LightColorDetector {

    public String colorDetector(int number) {

        if (number >= 380 && number <= 449) {
            return "Violet";
        }
        else if (number >= 450 && number <= 499) {
            return "Blue";
        }
        else if (number >= 495 && number <= 569) {
            return "Green";
        }
        else if (number >= 570 && number <= 589) {
            return "Yellow";
        }
        else if (number >= 590 && number <= 619) {
            return "Orange";
        }
        else if (number >= 620 && number <= 750) {
            return "Red";
        }
        else {
            return "Invisible light";
        }

    }


}
