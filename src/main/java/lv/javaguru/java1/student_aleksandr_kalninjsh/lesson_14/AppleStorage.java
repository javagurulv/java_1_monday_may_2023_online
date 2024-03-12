package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_14;

import java.util.ArrayList;
import java.util.List;

class AppleStorage {

    public List<Apple> getRedApples() {
        List<Apple> apples = getAllAples();
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("red")) {
                redApples.add(apple);
            }
        }
        return redApples;
    }


    public List<Apple> getApplesByColor(String color) {
        List<Apple> apples = getAllAples();
        List<Apple> colorApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                colorApples.add(apple);
            }
        }
        return colorApples;
    }
    
    public List<Apple> getHeavyApples(int weight) {
        List<Apple> apples = getAllAples();
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    public List<Apple> getLightApples(int weight) {
        List<Apple> apples = getAllAples();
        List<Apple> lightApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() <= weight) {
                lightApples.add(apple);
            }
        }
        return lightApples;
    }

    public List<Apple> getApplesByColorAndWeight(String color, int weight) {
        List<Apple> apples = getAllAples();
        List<Apple> applesByColorAndWeight = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)
            && apple.getWeight() == weight) {
                applesByColorAndWeight.add(apple);
            }
        }
        return applesByColorAndWeight;
    }

    public List<Apple> findApplesByPredicate(ApplePredicate predicate) {
        List<Apple> apples = getAllAples();
        List<Apple> foundApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                foundApples.add(apple);
            }
        }
        return foundApples;
    }

    public List<Apple> getAllAples() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }



}
