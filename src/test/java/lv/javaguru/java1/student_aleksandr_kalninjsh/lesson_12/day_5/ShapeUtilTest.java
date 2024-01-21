package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_5.*;


import lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_12.day_4.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void createRandomCircle() {
        Circle circle = new Circle("Circle", 9);
        shapeUtil.createRandomCircle();
        assertEquals(circle, 9);





    }

}