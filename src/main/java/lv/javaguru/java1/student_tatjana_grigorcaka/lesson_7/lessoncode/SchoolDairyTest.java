package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.lessoncode;

import java.util.List;

class SchoolDairyTest {

    public static void main(String[] args) {

        SchoolDairyTest test = new SchoolDairyTest();
        test.testFindZeroWhenNoMarksBySubject();
        test.testFindOneMarkBySubject();
        test.testFindTwoMarksBySubject();
        test.testFindZeroMaxMarkWhenNoMarksBySubject();
        test.testFindMaxMarkBySubject();
        test.testFindZeroMinMarkWhenNoMarksBySubject();
        test.testFindMinMarkBySubject();
        test.testCalculateZeroAverageMarkWhenNoMarksBySubject();
        test.testCalculateAverageMarkBySubject();

    }

    public void testFindZeroWhenNoMarksBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        List<Mark> subjectMarks = schoolDairy.findMarksBySubject("English");
        checkResult(subjectMarks.size(), 0, "testFindZeroWhenNoMarksBySubject");
    }

    public void testFindOneMarkBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("English", 8);
        schoolDairy.addMark(mark1);
        List<Mark> subjectMarks = schoolDairy.findMarksBySubject("English");
        checkResult(subjectMarks.size(), 1, "testFindOneMarkBySubject");
    }

    public void testFindTwoMarksBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 10);
        schoolDairy.addMark(mark1);
        Mark mark2 = new Mark("Math", 9);
        schoolDairy.addMark(mark2);
        List<Mark> subjectMarks = schoolDairy.findMarksBySubject("Math");
        checkResult(subjectMarks.size(), 2, "testFindTwoMarksBySubject");
    }

    public void testFindZeroMaxMarkWhenNoMarksBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 0);
        schoolDairy.addMark(mark1);
        int subjectMarks = schoolDairy.findMaxMark("Math");
        checkResult(subjectMarks, 0, "testFindZeroMaxMarkWhenNoMarksBySubject");
    }

    public void testFindMaxMarkBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 10);
        schoolDairy.addMark(mark1);
        Mark mark2 = new Mark("Math", 8);
        schoolDairy.addMark(mark2);
        Mark mark3 = new Mark("Math", 7);
        schoolDairy.addMark(mark3);
        int subjectMarks = schoolDairy.findMaxMark("Math");
        checkResult(subjectMarks, 10, "testFindMaxMarkBySubject");
    }


    public void testFindZeroMinMarkWhenNoMarksBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 0);
        schoolDairy.addMark(mark1);
        int subjectMarks = schoolDairy.findMinMark("Math");
        checkResult(subjectMarks, 0, "testFindZeroMinMarkWhenNoMarksBySubject");
    }

    public void testFindMinMarkBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 10);
        schoolDairy.addMark(mark1);
        Mark mark2 = new Mark("Math", 8);
        schoolDairy.addMark(mark2);
        Mark mark3 = new Mark("Math", 7);
        schoolDairy.addMark(mark3);
        int subjectMarks = schoolDairy.findMinMark("Math");
        checkResult(subjectMarks, 7, "testFindMinMarkBySubject");
    }

    public void testCalculateZeroAverageMarkWhenNoMarksBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 0);
        schoolDairy.addMark(mark1);
        Mark mark2 = new Mark("Math", 0);
        schoolDairy.addMark(mark2);
        Mark mark3 = new Mark("Math", 0);
        schoolDairy.addMark(mark3);
        int subjectMarks = schoolDairy.calculateAverageMarkV1("Math");
        checkResult(subjectMarks, 0, "testCalculateZeroAverageMarkWhenNoMarksBySubject");
    }

    public void testCalculateAverageMarkBySubject() {
        SchoolDairy schoolDairy = new SchoolDairy();
        Mark mark1 = new Mark("Math", 10);
        schoolDairy.addMark(mark1);
        Mark mark2 = new Mark("Math", 8);
        schoolDairy.addMark(mark2);
        Mark mark3 = new Mark("Math", 7);
        schoolDairy.addMark(mark3);
        int subjectMarks = schoolDairy.calculateAverageMarkV1("Math");
        checkResult(subjectMarks, 8, "testCalculateAverageMarkBySubject");
    }


        private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
