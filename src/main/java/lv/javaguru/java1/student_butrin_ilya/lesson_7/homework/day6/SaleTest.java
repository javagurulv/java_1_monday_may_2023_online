package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day6;

public class SaleTest {
    public static void main(String[] args) {
        Sale iceCream = new Sale("ice cream",10.4, 3 );
        Sale apple = new Sale("ice cream",44.4, 18 );
        Sale orange = new Sale("orange",55.3, 27 );
        Sale beer = new Sale("beer",14.9, 46 );
        Sale fish = new Sale("fish",23.4, 34 );
        Sale []  product = {iceCream, apple, orange, beer, fish};
        SaleTest test = new SaleTest();
        test.TestBestSale(product);
        test.TestMostSold(product);

    }
    public void TestMostSold(Sale [] sale) {
        BestSaleAndSold test = new BestSaleAndSold();
        String realRezult = "beer";
        Sale testProduct = test.mostSold(sale);
        String expectedRezult =  testProduct.getProduct();
        if (realRezult.equals(expectedRezult)) System.out.println("ok");
        else System.out.println("NO real rezult " + realRezult + " not equal expected rezult " + expectedRezult);
    }

    public void TestBestSale(Sale [] sale) {
        BestSaleAndSold test = new BestSaleAndSold();
        String realRezult = "orange";
        Sale testProduct = test.bestTotalSale(sale);
        String expectedRezult =  testProduct.getProduct();
        if (realRezult.equals(expectedRezult)) System.out.println("ok");
        else System.out.println("NO real rezult " + realRezult + " not equal expected rezult " + expectedRezult);
    }
}
