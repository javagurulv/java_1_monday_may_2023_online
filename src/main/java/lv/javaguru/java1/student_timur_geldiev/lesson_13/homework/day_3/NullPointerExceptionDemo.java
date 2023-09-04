package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_3;

class NullPointerExceptionDemo extends RuntimeException{

    public static void main(String[] args) {

        String example = null;

        try {
             if(example.equals("check")){
                 System.out.println("Equal");
             }
             else {
                 System.out.println("Not equal");
             }
        }catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }


    }
}
