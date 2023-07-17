package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

public class MaxMarkFinderTest {
    public static void main(String[] args) {
        MaxMarkFinderTest test = new MaxMarkFinderTest();
        test.checkMaxMark();
    }

    public void checkMaxMark() {
        int[] marks = {1, 4, 5, 7, 2, 10};
        MaxMarkFinder test1 = new MaxMarkFinder();
        int actual = test1.findMaxMark(marks);
        if (actual == 10){
            System.out.println("Test pass");
        }else {
            System.out.println("Test fail");
        }

    }
}
