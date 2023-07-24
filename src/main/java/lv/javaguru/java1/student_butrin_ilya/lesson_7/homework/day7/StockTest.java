package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day7;

public class StockTest {
    public static void main(String[] args) {
        Stock stock1 = new Stock("google", 342,2.2);
        Stock stock2 = new Stock("yandex", 34,-1);
        Stock stock3 = new Stock("intel", 45.1,2.4);
        Stock stock4 = new Stock("tesla", 363.56,3.5);
// 7,524 - 0,34 + 1,0104 + 12,7246
        Stock [] stock  = {stock1, stock2, stock3, stock4};
        StockTest test = new StockTest();
        test.testTotalCoast(stock);
        test.testAveragereturn(stock);

    }
    public  void testTotalCoast (Stock[] stock) {
        double realrezult = 342 + 34 + 45.1 + 363.56;
        TotalCostAndAverageReturn totalCostAndAverageReturn = new TotalCostAndAverageReturn();
        double expectedRezult = totalCostAndAverageReturn.totalCoast(stock);
        if(realrezult == expectedRezult) System.out.println("ok");
    }
    public  void testAveragereturn (Stock[] stock) {
        double realrezult = (342 * 2.2 / 100) + ((double)34 * (-1) /100) + (45.1 * 2.4 /100) + (363.56 * 3.5 / 100);
        TotalCostAndAverageReturn totalCostAndAverageReturn = new TotalCostAndAverageReturn();
        double expectedRezult = totalCostAndAverageReturn.averageReturn(stock);
        if(realrezult == expectedRezult) System.out.println("ok");
        else System.out.println("test FAIL rezon; realrezult " + realrezult + " not equal expexted rezul " + expectedRezult);
    }
}
