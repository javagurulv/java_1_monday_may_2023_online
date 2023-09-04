package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_1;

class MyException extends Exception {

    String message;

    public MyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}