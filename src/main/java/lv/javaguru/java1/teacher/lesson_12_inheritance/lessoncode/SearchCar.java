package lv.javaguru.java1.teacher.lesson_12_inheritance.lessoncode;

import java.util.Optional;

interface SearchCar {

    Car searchByNumber(String number);

    Optional<Car> searchByNumberV2(String number);

}
