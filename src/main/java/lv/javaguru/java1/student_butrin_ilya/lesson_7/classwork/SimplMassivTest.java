package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork;

public class SimplMassivTest {
    public static void main(String[] args) {
SimplMassivTest test = new SimplMassivTest();
test.massivTest();

    }
    public void massivTest (){
        SimplMassiv massiv = new SimplMassiv();
        int real1 = 10;
        int real2 = 0;
        int expected1 = massiv.massiv().length;
        int [] mass =  massiv.massiv();
        int expected2 = mass[3];
        if(real1 == expected1 && real2 == expected2) {
            System.out.println("+");
        }

    }
}
