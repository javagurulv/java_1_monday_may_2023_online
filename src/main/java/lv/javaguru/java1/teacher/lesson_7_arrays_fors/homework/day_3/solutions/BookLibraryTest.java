package lv.javaguru.java1.teacher.lesson_7_arrays_fors.homework.day_3.solutions;

class BookLibraryTest {

    public static void main(String[] args) {
        BookLibraryTest test = new BookLibraryTest();
        test.shouldReturnZeroWhenLibraryIsEmpty();

    }

    public void shouldReturnZeroWhenLibraryIsEmpty() {
        BookLibrary bookLibrary = new BookLibrary();
        int bookCount = bookLibrary.getBookCount();
        checkResult(bookCount, 0, "shouldReturnZeroWhenLibraryIsEmpty");
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

}
