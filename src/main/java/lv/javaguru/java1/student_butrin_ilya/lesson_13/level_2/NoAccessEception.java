package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_2;

public class NoAccessEception extends Exception{
    String message;
    public NoAccessEception(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
