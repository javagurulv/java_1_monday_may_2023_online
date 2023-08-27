package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.lessoncode.Shapes;

class Rectangle
        extends AbstractShape {


    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
       super(name);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculatePerimeter() { return 2 * a + 2 * b; }
    @Override
    public double calculateArea() { return a * b; }


}
