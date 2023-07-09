package lv.javaguru.java1.student_ainars_belinskis.lesson_5.homework.day_7;

public class CelsiaFarengeitApp {
    public static void main(String[] args) {
        CelsiaFarengeitConvertor celsiaFarengeitConvertor = new CelsiaFarengeitConvertor();
        System.out.println("температуру в градусах Цельсия: " + celsiaFarengeitConvertor.FarengeitToCelsia(68));
        System.out.println("температуру в градусах Фаренгейта: " + celsiaFarengeitConvertor.CelsiaToFarengeit(20));
        System.out.println("температуру в градусах Цельсия: " + celsiaFarengeitConvertor.FarengeitToCelsia(59));
        System.out.println("температуру в градусах Фаренгейта: " + celsiaFarengeitConvertor.CelsiaToFarengeit(15));
    }
}
