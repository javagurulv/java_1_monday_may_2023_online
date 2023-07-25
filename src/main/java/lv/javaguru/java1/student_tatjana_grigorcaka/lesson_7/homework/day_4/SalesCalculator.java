package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_4;


import java.util.ArrayList;
import java.util.List;

class SalesCalculator {

    public static void main(String[] args) {

        Check check1 = new Check(0012345, 30);
        Check check2 = new Check(0012346, 40);

        List<Check> allChecks = new ArrayList<>();
        int size = allChecks.size();

        allChecks.add(check1);
        allChecks.add(check2);

        for (int i = 0; i < allChecks.size(); i++) {
            Check Check = allChecks.get(i);
        }
    }

    private List<Check> allChecks = new ArrayList<>();

    public void addCheck(List<Check> allChecks, int checkNumber, int purchaseSum) {
        allChecks.add(new Check(checkNumber, purchaseSum));
    }

    public int sumPurchaseSum(List<Check> allChecks) {
        int sum = 0;
        for (int i = 0; i < allChecks.size(); i++) {
            Check check = allChecks.get(i);
            sum = sum + check.getPurchaseSum();
        }
        return sum;
    }

    public int averagePurchaseSum(List<Check> allChecks) {
        int sum = 0;
        int average = sumPurchaseSum(allChecks) / allChecks.size();
        return average;
    }
}

