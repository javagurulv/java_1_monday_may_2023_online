package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_2;

  import java.util.Scanner;

public class TriangleSquare {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a side: ");
        int aSide = scanner.nextInt();
        System.out.println("Input b side: ");
        int bSide = scanner.nextInt();
        System.out.println("Input c side: ");
        int cSide = scanner.nextInt();

        System.out.println("A side = " + aSide);
        System.out.println("B side = " + bSide);
        System.out.println("C side = " + cSide);

       double p = (aSide + bSide + cSide) / 2;
       double square = Math.sqrt(p*(p - aSide)*(p - bSide)*(p - cSide));

       System.out.println("Triangle square: " + square);







        




    }
}
