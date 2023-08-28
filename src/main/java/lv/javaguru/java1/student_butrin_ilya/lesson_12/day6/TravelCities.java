package lv.javaguru.java1.student_butrin_ilya.lesson_12.day6;

import java.util.Arrays;

public class TravelCities {
    void allSities (String name, String... city){
System.out.printf("%s посетил города: %s" , name, Arrays.toString(city));
}
}
