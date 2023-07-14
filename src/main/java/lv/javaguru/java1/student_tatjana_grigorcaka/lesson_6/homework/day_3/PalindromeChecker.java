package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_6.homework.day_3;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.isPalindrome("abba");
        System.out.println("Palindrome" + palindromeChecker.isPalindrome("abba"));
    }
}


