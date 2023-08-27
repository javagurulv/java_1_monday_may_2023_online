package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.lessoncode.Shapes;

class Square extends AbstractShape {


    private int a;

    public Square(String name, int  a) {
        super(name);
        this.a = a;

    }
    @Override
    public double calculatePerimeter() {return 4 * a; }
    @Override
    public double calculateArea() { return  a * a;}


}
