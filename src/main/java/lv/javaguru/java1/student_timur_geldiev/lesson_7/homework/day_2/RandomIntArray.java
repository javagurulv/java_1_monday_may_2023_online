package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_2;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
class RandomIntArray {

    public int[] randomIntArray(){
        int[] randIntArr = new int[10];
        for (int i=0; i<=randIntArr.length-1; i++){
            randIntArr[i] = ThreadLocalRandom.current().nextInt(100);
        } return randIntArr;
    }
    public void randomIntArrayPrinter(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
