package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_3;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
