package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_2;

class AccessDeniedException extends Exception{

    String message;

    public AccessDeniedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
