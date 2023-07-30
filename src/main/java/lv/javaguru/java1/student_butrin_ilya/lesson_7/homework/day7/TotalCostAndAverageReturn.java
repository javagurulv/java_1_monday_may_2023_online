package lv.javaguru.java1.student_butrin_ilya.lesson_7.homework.day7;

public class TotalCostAndAverageReturn {

    // в названии метода нет глагола показывающего какое действие
    // совершает этот метод
    public double totalCoast (Stock[] stock) {
        double totalCoast = 0;
        for (Stock a : stock) {
            totalCoast = totalCoast + a.getAssetValue();
        }
        return  totalCoast;
    }

    // в названии метода нет глагола показывающего какое действие
    // совершает этот метод
    public double averageReturn(Stock[] stock) {
        double averagereturn = 0;
        for (Stock a : stock) {
            averagereturn = averagereturn + a.getAssetValue() * a.getReturnInPercents() / 100;
        }
        return  averagereturn;
    }
}
