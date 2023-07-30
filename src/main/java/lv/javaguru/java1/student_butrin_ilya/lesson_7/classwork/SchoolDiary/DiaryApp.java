package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork.SchoolDiary;

import java.util.Scanner;

public class DiaryApp {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        Diary ilyaDiary = new Diary();
        do {
            System.out.println("меню: (для выбора пункта меню введите цифру и нажмите 'enter'");
            System.out.println("1) добавить новую оценку");
            System.out.println("2) посчитать среднюю оценку по предмету");
            System.out.println("3) узнать максимальную оценку по предмету");
            System.out.println("4) узнать минимальную оценку по предмету");
            System.out.println("5) знать среднюю оценку по всем предметам");
            System.out.println("6) выход");
            choice = Integer.parseInt(scan.nextLine());
            if (choice == 1) {
                String object;
                int mark;
                do {
                    System.out.print("введите предмет  или напишите 'exit', чтобы выйти в предыдущее меню ");
                    object = scan.nextLine();
                    if (!object.equals("exit")) {
                        System.out.print("введите оценку ");
                        mark = Integer.parseInt(scan.nextLine());
                        ilyaDiary.addMark(object, mark);
                    }
                } while (!object.equals("exit"));
            }
            if (choice == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("введите предмет");
                String object = sc.nextLine();
                System.out.println("Средняя оценка по предмету " + object + ": " + ilyaDiary.AverageMarkForObject(object));
            }

            if (choice == 3) {
                Scanner sc = new Scanner(System.in);
                System.out.println("введите предмет");
                String object = sc.nextLine();
                System.out.println("Самая хорошая оценка по предмету " + object + ": " + ilyaDiary.maxMarkForObject(object));
            }
            if (choice == 4) {
                System.out.println("введите предмет");
                String object = scan.nextLine();
                System.out.println("Самая плохая оценка по предмету " + object + ": " + ilyaDiary.minMarkForObject(object));
            }
            if (choice == 5) {
                System.out.println("средняя оценка по всем предметам = " + ilyaDiary.AverageAllMark());
            }
            if (choice == 6) System.out.println("ok, до скорых встреч");
        } while  (choice != 6);

    }
}
