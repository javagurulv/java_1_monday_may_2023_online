package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day6;

public class BestSaleAndSold {
    public Sale mostSold (Sale[] product){
        int maxUnitCount = 0;
        Sale mostSold = product[0];
        for (int i = 0; i<product.length; i++) {
            int unitCount = product[i].getUnitCount();
            if (unitCount > maxUnitCount) {
                maxUnitCount = unitCount;
                mostSold = product[i];
            }
        }
            return mostSold;
        }
    public Sale bestTotalSale (Sale[] product){
        double maxTotalSale = product[0].getUnitCount() * product[0].getPricePerUnit();;
        Sale bestTotalSale = product[0];
        for (int i = 0; i<product.length; i++) {
            double totalSale = product[i].getUnitCount() * product[i].getPricePerUnit();
            if (totalSale > maxTotalSale) {
                maxTotalSale = totalSale;
                bestTotalSale = product[i];
            }
        }
        return bestTotalSale;
    }


    }

