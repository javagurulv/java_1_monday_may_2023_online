package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day1;

public class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.averageTestIntRezult();
        averageFinderTest.averageTestDoubleRezult();
    }
    public void averageTestIntRezult () {
        AverageFinder averageFinder = new AverageFinder();
        int realRezult = 1;
        double expectedRezultOne = averageFinder.findAverage(-3, 5);
        checkRezult(realRezult , expectedRezultOne , "averageTestIntRezult");
    }
    public void averageTestDoubleRezult () {
        AverageFinder averageFinder = new AverageFinder();
        double realRezult = 4.5;
        double expectedRezultOne = averageFinder.findAverage(3, 6);
        checkRezult(realRezult , expectedRezultOne , "averageTestDoubleRezult");
    }
    public void checkRezult(double realRezult,
                            double expectedRezult,
                            String testnumber) {
        if (realRezult == expectedRezult) {System.out.println("test " + testnumber + " is ok"); }
        else {System.out.println("test" + testnumber + " is ne ok");}

    }
}
