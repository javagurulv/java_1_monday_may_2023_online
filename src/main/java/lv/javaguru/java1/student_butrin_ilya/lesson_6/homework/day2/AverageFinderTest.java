package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day2;

public class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.averageTest();
    }
    public void averageTest () {
        AverageFinder averageFinder = new AverageFinder();
        int realRezultOne = 1;
        double realRezultTwo = 5.5;
        double expectedRezultOne = averageFinder.findAverage(-3, 5);
        double expectedRezultTwo = averageFinder.findAverage(6, 5);
        checkRezult(realRezultOne , expectedRezultOne , "1");
        checkRezult(realRezultTwo, expectedRezultTwo , "2");
    }
    public void checkRezult(double realRezult,
                            double expectedRezult,
                            String testnumber) {
        if (realRezult == expectedRezult) {System.out.println("test " + testnumber + " is ok"); }
        else {System.out.println("test" + testnumber + " is ne ok");}

    }
}
