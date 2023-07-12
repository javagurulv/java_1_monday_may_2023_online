package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.lessoncode;

import java.util.Scanner;

class EnterNumberApp {

    public static void main(String[] args) {
        EnterNumber enterNumber = new EnterNumber();
        enterNumber.enterNumberV1();

        System.out.println("Enter number 2: ");
        enterNumber.enterNumberV2();

        System.out.println("Enter number 3: ");
        enterNumber.enterNumberV3();
        enterNumber.setText("Enter number 4: ");
        System.out.println(enterNumber.getText());
        enterNumber.enterNumberV3();

    }
}

