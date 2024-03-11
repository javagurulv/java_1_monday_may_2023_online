package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_1;

public class MyException extends Exception {

    private String message;

    public MyException (String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
