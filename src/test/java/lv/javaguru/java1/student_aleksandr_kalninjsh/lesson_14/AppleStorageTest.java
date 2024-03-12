package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_14;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleStorageTest {

    AppleStorage appleStorage = new AppleStorage();

    @Test
    public void redApples() {
        List<Apple> redApples = appleStorage.getRedApples();
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");
    }

    @Test
    public void applesByColor() {
        List<Apple> redApples = appleStorage.getApplesByColor("red");
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");
        List<Apple> greenApples = appleStorage.getApplesByColor("green");
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
        List<Apple> yellowApples = appleStorage.getApplesByColor("yellow");
        assertEquals(yellowApples.size(), 2);
        assertEquals(yellowApples.get(0).getColor(), "yellow");
        assertEquals(yellowApples.get(1).getColor(), "yellow");
    }

    @Test
    public void heavyApples() {
        List<Apple> heavyApples = appleStorage.getHeavyApples(100);
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    public void lightApples() {
        List<Apple> lightApples = appleStorage.getLightApples(100);
        assertEquals(lightApples.size(), 4);
    }

    @Test
    public void applesByColorAndWeight() {
        List<Apple> applesByColorAndWeight = appleStorage.getApplesByColorAndWeight("green", 200);
        assertEquals(applesByColorAndWeight.size(), 1);
    }

    @Test
    public void applesByPredicate() {
        List<Apple> redApples = appleStorage.findApplesByPredicate(new ApplePredicate.RedApplePredicate());
        assertEquals(redApples.size(), 3);
        List<Apple> greenApples = appleStorage.findApplesByPredicate(new ApplePredicate.GreenApplePredicate());
        assertEquals(greenApples.size(), 3);
        List<Apple> heavyApplePredicate = appleStorage.findApplesByPredicate(new ApplePredicate.HeavyApplePredicate(100));
        assertEquals(heavyApplePredicate.size(), 4);
        List<Apple> lightApplePredicate = appleStorage.findApplesByPredicate(new ApplePredicate.LightApplePredicate(100));
        assertEquals(lightApplePredicate.size(), 4);
        List<Apple> appleByColorAndWeight = appleStorage.findApplesByPredicate(new ApplePredicate.AppleByColorAndWeight("red", 160));
        assertEquals(appleByColorAndWeight.size(), 1);



    }

}