package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day1;

public class Wavelength {
    public String FindTheColor(int number) {
        String rezult;
        if ((number >= 380) && (number < 450))  rezult = "Violet";
        else if ((number > 451) && (number < 495)) rezult = "Blue";
        else if ((number >= 495) && (number < 570))  rezult = "Green";
        else if ((number >= 570) && (number < 590))  rezult = "Yellow";
        else if ((number >= 590) && (number < 620))  rezult = "Orange";
        else if ((number >= 620) && (number < 750))  rezult = "Red";
        else   rezult = "Invisible Light";
return rezult;


        }

    }
