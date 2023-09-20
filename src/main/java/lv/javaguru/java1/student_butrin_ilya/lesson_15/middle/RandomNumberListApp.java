package lv.javaguru.java1.student_butrin_ilya.lesson_15.middle;

import java.util.List;
import java.util.Random;

public class RandomNumberListApp {
    public static void main(String[] args) {

        RandomNumberList random = new RandomNumberList();
        GetRandomNumber num = new GetRandomNumber();
        List <Integer> ran =  num.getRandomNumbers();

   Thread th1 = new Thread(new GetRandomNumber());
   Thread th2 = new Thread(new GetRandomNumber());
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        }
        catch (InterruptedException o) {}



        System.out.println(ran.size());
        System.out.println(ran.get(0));
        System.out.println(ran.get(1));


    }
}
