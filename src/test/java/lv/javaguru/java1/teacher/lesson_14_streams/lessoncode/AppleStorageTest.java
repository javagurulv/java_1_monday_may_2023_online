package lv.javaguru.java1.teacher.lesson_14_streams.lessoncode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleStorageTest {

    private AppleStorage storage = new AppleStorage();

    @Test
    public void shouldReturnGreenApples() {
        List<Apple> greenApples = storage.getGreenApples();
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
    }

    @Test
    public void shouldReturnRedApples() {
        List<Apple> redApples = storage.getRedApples();
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");
    }

    @Test
    public void shouldReturnApplesByColor() {
        List<Apple> redApples = storage.getApplesByColor("red");
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");

        List<Apple> greenApples = storage.getApplesByColor("green");
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
    }

    @Test
    public void shouldReturnApplesByPredicate() {
        List<Apple> redApples = storage.findApplesByPredicate(
                new RedApplePredicate()
        );
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");

        List<Apple> greenApples = storage.findApplesByPredicate(
                new GreenApplePredicate()
        );
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");

        List<Apple> lightApples = storage.findApplesByPredicate(
                new LigthWeightApplePredicate(100)
        );
        assertEquals(lightApples.size(), 4);
    }


    @Test
    public void shouldReturnApplesByPredicatesAnd() {
        List<Apple> apples = storage.findApplesByPredicatesAnd(
                new RedApplePredicate(),
                new GreenApplePredicate()
        );
        assertEquals(apples.size(), 0);

        apples = storage.findApplesByPredicatesAnd(
                new RedApplePredicate(),
                new LigthWeightApplePredicate(150)
        );
        assertEquals(apples.size(), 1);

        apples = storage.findApplesByPredicatesAnd(
                new RedApplePredicate(),
                new HeavyWeightApplePredicate(150)
        );
        assertEquals(apples.size(), 2);
    }

    @Test
    public void shouldReturnApplesByPredicatesOr() {
        List<Apple> apples = storage.findApplesByPredicatesOr(
                new RedApplePredicate(),
                new GreenApplePredicate()
        );
        assertEquals(apples.size(), 6);

        apples = storage.findApplesByPredicatesOr(
                new RedApplePredicate(),
                new LigthWeightApplePredicate(150)
        );
        assertEquals(apples.size(), 6);
    }


    @Test
    public void shouldReturnApplesByPredicateAnonimClass() {
        List<Apple> yellowApples = storage.findApplesByPredicate(
                new ApplePredicate() {
                    @Override
                    public boolean test(Apple apple) {
                        return apple.getColor().equals("yellow");
                    }
                }
        );
        assertEquals(yellowApples.size(), 2);
        assertEquals(yellowApples.get(0).getColor(), "yellow");
        assertEquals(yellowApples.get(1).getColor(), "yellow");

        List<Apple> redApples = storage.findApplesByPredicate(
                new ApplePredicate() {
                    @Override
                    public boolean test(Apple apple) {
                        return apple.getColor().equals("red");
                    }
                }
        );

    }


    @Test
    public void shouldReturnApplesByPredicateLambda() {
        List<Apple> yellowApples = storage.findApplesByPredicate(
                apple -> apple.getColor().equals("yellow")
        );

        yellowApples = storage.findApplesByPredicate(
                apple -> {
                    String color = apple.getColor();
                    return color.equals("yellow");
                }
        );

        assertEquals(yellowApples.size(), 2);
        assertEquals(yellowApples.get(0).getColor(), "yellow");
        assertEquals(yellowApples.get(1).getColor(), "yellow");

        List<Apple> redApples = storage.findApplesByPredicate(
                apple -> apple.getColor().equals("red")
        );

        List<Apple> heavyRedApples = storage.findApplesByPredicate(
                apple -> apple.getColor().equals("red")
                           && apple.getWeight() > 150
        );
    }


}