package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_4;

class StackOverflow {
    public static void main(String[] args) {

        try {
            StackOverflow error = new StackOverflow();
            error.recursion();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflow error exists");

        }
    }

    void recursion() {
        recursion();
    }
}

