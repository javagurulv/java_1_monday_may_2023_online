package lv.javaguru.java1.teacher.lesson_7_arrays_fors.homework.day_6.solutions;

class SalesAnalyser {

    public String findBestSellingProduct(Sale[] sales) {
        if ((sales == null) || (sales.length == 0)) {
            return null;
        } else {
            String bestSellingProduct = sales[0].getProduct();
            int salesCount = calculateSalesUnitCount(sales, bestSellingProduct);
            for (int i = 0; i < sales.length; i++) {
                if (calculateSalesUnitCount(sales, sales[i].getProduct()) > salesCount) {
                    bestSellingProduct = sales[i].getProduct();
                    salesCount = calculateSalesUnitCount(sales, bestSellingProduct);
                }
            }
            return bestSellingProduct;
        }
    }

    private int calculateSalesUnitCount(Sale[] sales, String product) {
        int salesUnitCount = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (product.equals(sale.getProduct())) {
                salesUnitCount += sale.getUnitCount();
            }
        }
        return salesUnitCount;
    }

}
