package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_3;

class NullPointerExceptionDemo {

    public static void main(String[] args) throws NullPointerException {
        String nullPointer = null;

        try {
            if (nullPointer.equals("null")) {
                System.out.println("Null pointer equals null");
            }
            else {
                System.out.println("Null pointer not equals");
            }
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
