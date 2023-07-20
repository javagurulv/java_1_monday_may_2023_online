package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

class IsPalindrome {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome1 = new IsPalindrome();
        isPalindrome1.isPalindrome("abba");
        System.out.println("Palindrome" + isPalindrome1.isPalindrome("abba"));
    }
}


