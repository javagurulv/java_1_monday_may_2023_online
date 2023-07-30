package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_6;


class SaleStatistic {


        public String findBestSellingProductByCount (Sale[]sales){
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
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
               Sale sale = sales[i];
                if (product.equals(sale.getProduct())) {
                    sum += sale.getUnitCount();
                }
            }
            return sum;
        }

        public String findMostProfitableProductBySalesIncomeSum (Sale[]sales){
            String mostProfitableProduct = sales[0].getProduct();
            int salesIncomeSum =  calculateSalesIncomeSum(sales,mostProfitableProduct);
            for (int i = 0; i < sales.length; i++) {
                if (calculateSalesIncomeSum(sales, sales[i].getProduct()) > salesIncomeSum) {
                    mostProfitableProduct = sales[i].getProduct();
                    salesIncomeSum = calculateSalesIncomeSum(sales, mostProfitableProduct);
                }
            }
            return mostProfitableProduct;
        }

        private int calculateSalesIncomeSum(Sale[] sales, String product) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
                if (product.equals(sale.getProduct())) {
                sum = sale.getUnitCount() * sale.getPricePerUnit();
                }
            }
            return (int) sum;
        }
    }




