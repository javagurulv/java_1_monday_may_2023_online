package lv.javaguru.java1.student_ainars_belinskis.lesson_2.homework.day_2;

import java.util.Scanner;
class HelloName {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("What's your name?: ");
            String name = in.nextLine();

            System.out.println("Hello " + name +"!");

        }

}
