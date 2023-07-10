package lv.javaguru.java1.student_timur_geldiev.lesson_6.classwork;


import lv.javaguru.java1.student_timur_geldiev.lesson_5.classwork.EvenNumberDetector;

public class EvenNumberDetectorTest {
    public static void main(String[] args) {
        EvenNumberDetectorTest test1 = new EvenNumberDetectorTest();
        test1.shouldBeEven();
        test1.shouldNotBeEven();
    }

    public void shouldBeEven(){
        int number = 10;
        EvenNumberDetector check = new EvenNumberDetector();
        boolean isEven = check.isEven(number);
        if (isEven){
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAIL");
        }
    }
    public void shouldNotBeEven(){
        int number = 11;
        EvenNumberDetector check = new EvenNumberDetector();
        boolean notEven = check.isEven(number);
        if(!notEven){
            System.out.println("Test PASS");
        } else{
            System.out.println("Test FAIL");
        }
    }
}
