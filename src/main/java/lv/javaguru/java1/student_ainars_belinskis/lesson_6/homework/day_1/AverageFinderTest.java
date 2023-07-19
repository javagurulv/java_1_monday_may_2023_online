package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_1;

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.findAverageTwoEvenNumbers();
        test.findAverageTwoOddNumbers();
        test.findAverageOddEvenNumbers();

    }

    public void findAverageTwoEvenNumbers(){
        AverageFinder averageFinder = new AverageFinder();
        int num1 = 2;
        int num2 = 6;
        double result = averageFinder.findAverage(num1,num2);
        checkResult(result, 4,"findAverageTwoEvenNumbers");

    }

    public void findAverageTwoOddNumbers(){
        AverageFinder averageFinder = new AverageFinder();
        int num1 = 3;
        int num2 = 5;
        double result = averageFinder.findAverage(num1,num2);
        checkResult(result, 4,"findAverageTwoOddNumbers");

    }

    public void findAverageOddEvenNumbers(){
        AverageFinder averageFinder = new AverageFinder();
        int num1 = 3;
        int num2 = 4;
        double result = averageFinder.findAverage(num1,num2);
        checkResult(result, 3.5,"findAverageOddEvenNumbers");

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
