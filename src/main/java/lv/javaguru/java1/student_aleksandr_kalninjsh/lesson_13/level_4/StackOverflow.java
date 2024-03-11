package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_4;

class StackOverflow {

    public static void main(String[] args) {
        StackOverflow error = new StackOverflow();

        try {
            error.recussion();
        } catch (StackOverflowError e) {
            System.out.println("Stack over flow error!");
        }
    }
    void recussion() {
        recussion();
    }
}
