package lv.javaguru.java1.student_timur_geldiev.lesson_7.classwork;

class MaxMarkFinder {

    public int findMaxMark(int[] marks){
        int max = marks[0];
        for (int i=0; i < marks.length; i++){
            int mark = marks[i];
            if(mark > max){
                max = mark;
            }

        } return max;
    }
}
