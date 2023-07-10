package lv.javaguru.java1.student_timur_geldiev.lesson_6.classwork;


import lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork.OddNumberDetector;

public class OddNumberDetectorTest {
    public static void main(String[] args) {
        OddNumberDetectorTest test1 = new OddNumberDetectorTest();
        test1.shouldBeOdd();
        test1.shouldNotBeOdd();
    }

    public void shouldBeOdd(){
        int number = 11;
        OddNumberDetector check = new OddNumberDetector();
        boolean isOdd = check.isOdd(number);
        if (isOdd){
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAIL");
        }
    }
    public void shouldNotBeOdd(){
        int number = 10;
        OddNumberDetector check = new OddNumberDetector();
        boolean notOdd = check.isOdd(number);
        if(!notOdd){
            System.out.println("Test PASS");
        } else{
            System.out.println("Test FAIL");
        }
    }
}
