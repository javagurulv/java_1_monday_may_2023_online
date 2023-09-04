package lv.javaguru.java1.teacher.lesson_14_streams.lessoncode;

import java.util.ArrayList;
import java.util.List;

class AppleStorage {

    public List<Apple> findApplesByPredicatesOr(ApplePredicate ... predicates) {
        List<Apple> apples = getAllApples();
        List<Apple> foundApples = new ArrayList<>();
        for (Apple apple : apples) {
            // 1 - n - predicates
            // 1 apple
            // if any predicate = true -> add apple to list
            for (ApplePredicate predicate : predicates) {
                if (predicate.test(apple)) {
                    foundApples.add(apple);
                    break;
                }
            }
        }
        return foundApples;
    }


    public List<Apple> findApplesByPredicatesAnd(ApplePredicate ... predicates) {
        List<Apple> apples = getAllApples();
        List<Apple> foundApples = new ArrayList<>();
        for (Apple apple : apples) {
            // 1 - n - predicates
            // 1 apple
            // if all predicates = true -> add apple to list
            boolean isOk = true;
            for (ApplePredicate predicate : predicates) {
                if (!predicate.test(apple)) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                foundApples.add(apple);
            }
        }
        return foundApples;
    }


    public List<Apple> findApplesByPredicate(ApplePredicate predicate) {
        List<Apple> apples = getAllApples();
        List<Apple> foundApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                foundApples.add(apple);
            }
        }
        return foundApples;
    }

    public List<Apple> getApplesByColorAndWeight(String color,
                                                 int weight) {
        List<Apple> apples = getAllApples();
        List<Apple> foundApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)
                && apple.getWeight() == weight) {
                foundApples.add(apple);
            }
        }
        return foundApples;
    }


    public List<Apple> getHeavyApples(int limitWeight) {
        List<Apple> apples = getAllApples();
        List<Apple> weightApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > limitWeight) {
                weightApples.add(apple);
            }
        }
        return weightApples;
    }

    public List<Apple> getLightApples(int limitWeight) {
        List<Apple> apples = getAllApples();
        List<Apple> lightApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() <= limitWeight) {
                lightApples.add(apple);
            }
        }
        return lightApples;
    }

    public List<Apple> getApplesByColor(String color) {
        List<Apple> apples = getAllApples();
        List<Apple> colorApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                colorApples.add(apple);
            }
        }
        return colorApples;
    }

    public List<Apple> getGreenApples() {
        List<Apple> apples = getAllApples();
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("green")) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> getRedApples() {
        List<Apple> apples = getAllApples();
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("red")) {
                redApples.add(apple);
            }
        }
        return redApples;
    }


    public List<Apple> getAllApples() {
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
