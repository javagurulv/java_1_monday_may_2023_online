package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_1;

// int 2 and int 6
// 2 and 3
// 3.2 and 5.1

//Второй и третий тесты показывают, что метод не может работать с дробными числами.
//Необходимо изменить тип данных на double
public class AverageFinderTest {

    public static void main(String[] args) {

        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1 () {
        AverageFinder average1 = new AverageFinder();
        double result = average1.findAverage(2,6);
        checkResult(result,4,"test1");
    }
    public void test2 () {
        AverageFinder average2 = new AverageFinder();
        double result = average2.findAverage(2,3);
        checkResult(result,2.5,"test2");

    }
    public void test3 () {
        AverageFinder average3 = new AverageFinder();
        double result = average3.findAverage(3.2, 5.1);
        checkResult(result,4.15,"test2");

    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
