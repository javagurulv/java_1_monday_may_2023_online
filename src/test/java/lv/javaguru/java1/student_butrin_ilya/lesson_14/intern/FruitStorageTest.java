package lv.javaguru.java1.student_butrin_ilya.lesson_14.intern;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    FruitStorage fruits = new FruitStorage();


    @Test
    void getGreenApple() {
        List<Apple> greenaple = fruits.findAppleByColor("green");
        assertEquals(greenaple.size(), 3);
        assertEquals(greenaple.get(0).getColor(), "green");
        assertEquals(greenaple.get(1).getColor(), "green");
        assertEquals(greenaple.get(2).getColor(), "green");
    }

    @Test
    void getYellowApple() {
        List<Apple> greenaple = fruits.findAppleByColor("yellow");
        assertEquals(greenaple.size(), 2);
        assertEquals(greenaple.get(0).getColor(), "yellow");
        assertEquals(greenaple.get(1).getColor(), "yellow");
    }

    @Test
    void getHeavyApples() {
        List<Apple> heavyApples = fruits.findHeavyApples(150);
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    void getLightApples() {
        List<Apple> lightApples = fruits.findLightApples(150);
        assertEquals(lightApples.size(), 4);
    }

    @Test
    void getRedApplesByPredicate() {
        List<Apple> redApples = fruits.filterApples(new RedApplePredicate());
        assertEquals(redApples.size(), 3);
    }

    @Test
    void getGreenApplesByPredicate() {
        List<Apple> greenApples = fruits.filterApples(new GreenApplePredicate());
        assertEquals(greenApples.size(), 3);
    }

    @Test
    void getHeavyApplesByPredicate() {
        List<Apple> heavyApples = fruits.filterApples(new HeavyApplePredicate(150));
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    void getLightApplesByPredicate() {
        List<Apple> lightApples = fruits.filterApples(new HeavyApplePredicate(150));
        assertEquals(lightApples.size(), 4);
    }

    @Test
    void getGreenAngHeavyByPredicate() {
        List<Apple> GreenAngHeavyApples = fruits.filterApples(new GreenAndHeavyApplePredicate(150));
        assertEquals(GreenAngHeavyApples.size(), 1);
    }

    @Test
    void getYellowApplesByPredicateUsingAnonimClass() {
        List<Apple> yellowApples = fruits.filterApples(new ApplePredicate() {
            public Boolean isOk(Apple apple) {
                return apple.getColor().equals("yellow");
            }
        });

        assertEquals(yellowApples.size(), 2);
    }

    @Test
    void getHeavyApplesByPredicateUsingAnonimClass() {
        List<Apple> heavyApples = fruits.filterApples(new ApplePredicate() {
            int weight = 150;

            public Boolean isOk(Apple apple) {
                return apple.getWeight() > weight;
            }
        });

        assertEquals(heavyApples.size(), 4);
    }

    @Test
    void getGreenApplesUsingLjambda() {
        List greenApple = fruits.filterApples(apple -> apple.getColor().equals("green"));
        assertEquals(greenApple.size(), 3);

    }

    @Test
    void getHeavyApplesUsingLjambda() {
        List heavyApple = fruits.filterApples(apple -> apple.getWeight() > 150);
        assertEquals(heavyApple.size(), 4);
    }
    @Test
    void getHeavyAngYellowApplesUsingLjambda() {
        List heavyAndYellowApple = fruits.filterApples(apple -> apple.getWeight() > 150 && apple.getColor().equals("yellow"));
        assertEquals(heavyAndYellowApple.size(), 1);
    }
}