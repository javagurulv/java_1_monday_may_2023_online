package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_2;



class RandomIntArray {

    public double [] newArray () {
        double [] array = new double [10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100) + 1 ;}
        return array;
    }

    public void getRandomNumbers(double [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Your random number is: " + (int)array[i] + " ");
        }
    }
}

