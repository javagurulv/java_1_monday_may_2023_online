package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_3;

class TestEx extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestEx();
        } catch(TestEx t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
