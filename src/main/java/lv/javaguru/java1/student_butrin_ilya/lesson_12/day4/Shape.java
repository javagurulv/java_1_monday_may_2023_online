package lv.javaguru.java1.student_butrin_ilya.lesson_12.day4;

public abstract class Shape {

        private String title;

        Shape(String title) {
            this.title = title;
        }
        public abstract double calculateArea();
       public abstract double calculatePerimetr();

    }
