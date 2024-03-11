package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_2;

class AccessDeniedException extends Exception {

    String message;

    public AccessDeniedException (String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
