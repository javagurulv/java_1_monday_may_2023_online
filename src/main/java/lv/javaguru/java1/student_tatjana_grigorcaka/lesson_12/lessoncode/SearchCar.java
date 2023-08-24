package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_12.lessoncode;

import java.util.Optional;

interface SearchCar {

    Car searchByNumber(String number);

    Optional<Car> searchByNumberV2(String number);

}
