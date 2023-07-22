package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_2;

class RandomIntArrayApp {

    public static void main(String[] args) {
        RandomIntArray array1 = new RandomIntArray();
        int[] array = array1.randomIntArray();
        System.out.println("Randomly filled array elements are: ");
        array1.printRandomIntArray(array);


    }
}

