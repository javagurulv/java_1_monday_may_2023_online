package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.lessoncode;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (isNotDividedBy100(year) && isDividedBy4(year)) {
            return true;
        } else if (isDividedBy100(year) && isDividedBy400(year)) {
            return true;
        } else if (isDividedBy400(year)) {
            return true;
        } else
            return false;
    }

    private static boolean isNotDividedBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }

    private static boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    private static boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }
}

