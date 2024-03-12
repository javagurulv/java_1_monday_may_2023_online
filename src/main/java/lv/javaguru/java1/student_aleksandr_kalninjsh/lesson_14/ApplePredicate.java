package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_14;

interface ApplePredicate {

    boolean test (Apple apple);

    class RedApplePredicate implements ApplePredicate {

        @Override
        public boolean test (Apple apple) {
            return apple.getColor().equals("red");
        }
    }

    class GreenApplePredicate implements ApplePredicate {

        @Override
        public boolean test (Apple apple) {
            return apple.getColor().equals("green");
        }
    }

    class HeavyApplePredicate implements ApplePredicate {

        private int weight;

        public HeavyApplePredicate (int weight) {
            this.weight = weight;
        }
        @Override
        public boolean test (Apple apple) {
            return apple.getWeight() > weight;
        }
    }

    class LightApplePredicate implements ApplePredicate {

        private int weight;

        public LightApplePredicate (int weight) {
            this.weight = weight;
        }
        @Override
        public boolean test (Apple apple) {
            return apple.getWeight() <= weight;
        }
    }

    class AppleByColorAndWeight implements ApplePredicate {

        private String color;
        private int weight;

        public AppleByColorAndWeight (String color, int weight) {
            this.color = color;
            this.weight = weight;
        }
        @Override
        public boolean test (Apple apple) {
            return apple.getColor().equals(color) && apple.getWeight() == weight;
        }
    }
}
