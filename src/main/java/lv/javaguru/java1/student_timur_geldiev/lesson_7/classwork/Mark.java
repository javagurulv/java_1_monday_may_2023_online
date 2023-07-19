package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

class Mark {

    private String subject;

    public Mark(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    private int mark;

    public String getSubject() {
        return subject;
    }


}
