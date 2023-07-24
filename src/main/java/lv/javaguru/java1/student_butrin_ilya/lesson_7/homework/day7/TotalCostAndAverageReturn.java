package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day7;

public class TotalCostAndAverageReturn {
    public double totalCoast (Stock[] stock) {
        double totalCoast = 0;
        for (Stock a : stock) {
            totalCoast = totalCoast + a.getAssetValue();
        }
        return  totalCoast;
    }
    public double averageReturn(Stock[] stock) {
        double averagereturn = 0;
        for (Stock a : stock) {
            averagereturn = averagereturn + a.getAssetValue() * a.getReturnInPercents() / 100;
        }
        return  averagereturn;
    }
}
