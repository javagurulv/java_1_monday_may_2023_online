package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_6;

class SalesAnalysis {

    public String bestSellingProductByCount(Sale[] sales) {
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

    public String mostProfitableProductBySalesAmount(Sale[] sales) {
        String mostProfitableProduct = sales[0].getProduct();
        int salesAmount = calculateSalesAmount(sales, mostProfitableProduct);
        for (int i = 0; i < sales.length; i++) {
            if (calculateSalesAmount(sales, sales[i].getProduct()) > salesAmount) {
                mostProfitableProduct = sales[i].getProduct();
                salesAmount = calculateSalesAmount(sales, mostProfitableProduct);
            }
        }
        return mostProfitableProduct;
    }

    private int calculateSalesAmount(Sale[] sales, String product) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (product.equals(sale.getProduct())) {
                salesAmount += sale.getPricePerUnit();
            }
        }
        return salesAmount;
    }

}
