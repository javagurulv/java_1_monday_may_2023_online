package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_3;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
