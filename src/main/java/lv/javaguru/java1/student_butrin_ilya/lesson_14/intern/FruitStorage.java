package lv.javaguru.java1.student_butrin_ilya.lesson_14.intern;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

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
    public List<Apple> findAppleByColor(String color){
       List<Apple> allApples =  getAllApples();
       List <Apple> greenApples = new ArrayList<>();
       for(Apple apple: allApples){
           if (apple.getColor().equals(color)){
               greenApples.add(apple);
           }
       }
        return greenApples;
    }
    public List <Apple> findHeavyApples(int weight) {
        List<Apple> allApples = getAllApples();
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : allApples) {
            if (apple.getWeight() > weight) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

        public List <Apple> findLightApples(int weight){
            List<Apple> allApples =  getAllApples();
            List <Apple> lightApples = new ArrayList<>();
            for(Apple apple:allApples){
                if(apple.getWeight()<= weight) {
                    lightApples.add(apple);
                }
            }
            return lightApples;
    }
    public List<Apple> filterApples (ApplePredicate predicate){
        List<Apple> allApples =  getAllApples();
        List <Apple> rezult  = new ArrayList<>();
        for (Apple apple: allApples){
            if (predicate.isOk(apple)) {
                rezult.add(apple);
            }
        }
        return rezult;
    }
}
