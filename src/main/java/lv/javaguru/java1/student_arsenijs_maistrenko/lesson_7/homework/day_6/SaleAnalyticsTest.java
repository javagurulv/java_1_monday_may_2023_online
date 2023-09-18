package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_6;

public class SaleAnalyticsTest {
    public static void main(String[] args) {
        Sale item1 = new Sale("playstation 1",15.4, 44 );
        Sale item2 = new Sale("playstation 2",23.4, 111 );
        Sale item3 = new Sale("playstation 3",48.6, 77 );
        Sale item4 = new Sale("playstation 4",60.0, 88 );
        Sale item5 = new Sale("playstation 5",99.9, 30 );
        Sale []  product = {item1, item2, item3, item4, item5};
        SaleAnalyticsTest test = new SaleAnalyticsTest();
        test.TestBestSale(product);
        test.TestMostSold(product);

    }
    public void TestMostSold(Sale [] sale) {
        SaleAnalytics test = new SaleAnalytics();
        String realRezult = "playstation 2";
        Sale testProduct = test.mostSold(sale);
        String expectedRezult =  testProduct.getProduct();
        if (realRezult.equals(expectedRezult)) System.out.println("PASS");
        else System.out.println("FAIL");
    }

    public void TestBestSale(Sale [] sale) {
        SaleAnalytics test = new SaleAnalytics();
        String realRezult = "playstation 4";
        Sale testProduct = test.bestTotalSale(sale);
        String expectedRezult =  testProduct.getProduct();
        if (realRezult.equals(expectedRezult)) System.out.println("PASS");
        else System.out.println("FAIL");
    }

}