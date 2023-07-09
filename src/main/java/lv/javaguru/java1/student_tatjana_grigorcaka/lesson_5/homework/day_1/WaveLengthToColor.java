package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_1;

class WaveLengthToColor {

    public String convertWaveLengthToColor(int number) {
        String result;
        {
         if ((number >= 380) && (number <= 449)) {
              result = "Violet";
         } else if ((number >= 450) && (number <= 494)) {
              result = "Blue";
         } else if ((number >= 495) && (number <= 569))  {
                result = "Green";
         } else if ((number >= 570) && (number <= 589))  {
                result = "Yellow";
         } else if ((number >= 590) && (number <= 619))  {
                result = "Orange";
         } else if ((number >= 620) && (number <= 750))  {
                result = "Red";
         } else {
                result = "Invisible Light";
         }
            return result;
        }
    }
}
