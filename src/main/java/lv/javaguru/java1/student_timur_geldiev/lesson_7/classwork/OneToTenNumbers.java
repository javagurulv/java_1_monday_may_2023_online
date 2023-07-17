package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

class OneToTenNumbers {
    public String numsToConsole() {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str = str + i + " ";
        } return str;
    }

    public void numsToConsoleV2(int fromNumber, int toNumber) {
        if (toNumber > fromNumber) {
            for (int i = fromNumber; i <= toNumber; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Range is wrong");
        }
    }

}

