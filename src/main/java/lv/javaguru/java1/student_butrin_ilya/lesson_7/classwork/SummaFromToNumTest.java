package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork;

public class SummaFromToNumTest {
    public static void main(String[] args) {
SummaFromToNumTest test = new SummaFromToNumTest();
test.testSumma();
    }
    public void testSumma () {
        SummaFromToNum summa = new SummaFromToNum();
        int realRezult = 6;
        int expectedRezult = summa.summa(1, 3);
        if (realRezult == expectedRezult) System.out.println("ok");
    }
}
