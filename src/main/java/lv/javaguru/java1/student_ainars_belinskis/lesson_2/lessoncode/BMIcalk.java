package lv.javaguru.java1.student_ainars_belinskis.lesson_2.lessoncode;

import java.util.Scanner;

public class BMIcalk {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш вес (кг):");
        float vesKg = in.nextFloat();

        System.out.println("Введите ваш рост (сm):");
        float rostSm = in.nextFloat();

        float rostM = rostSm / 100;
        float bmi = vesKg / (rostM * rostM);

        System.out.println("Ваш вес:" + vesKg);
        System.out.println("Ваш рост (м):" + rostM);
        System.out.println("Ваш BMI:" + bmi);

        if (bmi < 16) {
            System.out.println("У Вас выраженный дефицит массы тела");
            }
        else if (bmi >= 16 && bmi < 18.5) {
                System.out.println("У Вас недостаточная масса тела (дефицит)");
            }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Ваша масса тела в приделах нормы");
            }
        else if (bmi >= 25  && bmi < 30) {
            System.out.println("У Вас избыточная масса тела (предожирение)");
            }
        else if (bmi >= 30  && bmi < 35) {
            System.out.println("У Вас ожирение 1 степени");
        }
        else if (bmi >= 35  && bmi < 40) {
            System.out.println("У Вас ожирение 2 степени");
        }
        else if (bmi >= 40) {
            System.out.println("У Вас ожирение 3 степени");
        }


    }

}
