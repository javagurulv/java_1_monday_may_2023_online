package lv.javaguru.java1.teacher.lesson_7_arrays_fors.lessoncode.tasks;

class ArrayCreation {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }


    public int[] createArray() {
        int[] array = new int[3];
        array[0] = 0;
        array[1] = 0;
        array[2] = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }

}
