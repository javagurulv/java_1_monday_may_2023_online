package lv.javaguru.java1.student_butrin_ilya.lesson_14.intern;
@FunctionalInterface
public interface ApplePredicate {
    Boolean isOk (Apple apple);
}
class GreenApplePredicate implements ApplePredicate {
    @Override
    public Boolean isOk(Apple apple) {
        return apple.getColor().equals("green");
    }
}

    class RedApplePredicate implements ApplePredicate {
        @Override
        public Boolean isOk(Apple apple) {
        return apple.getColor().equals("red");
        }
    }

    class HeavyApplePredicate implements ApplePredicate {
    int weight;

        public HeavyApplePredicate(int weight) {
            this.weight = weight;
        }

        @Override
        public Boolean isOk(Apple apple) {
            return apple.getWeight() > weight;
        }
    }

    class LightApplePredicate implements ApplePredicate {
        int weight;

        public LightApplePredicate(int weight) {
            this.weight = weight;
        }

        @Override
        public Boolean isOk(Apple apple) {
            return apple.getWeight() <= weight;
        }
    }
        class GreenAndHeavyApplePredicate implements ApplePredicate{
            int weight;

            public GreenAndHeavyApplePredicate(int weight) {
                this.weight = weight;
            }
            @Override
            public Boolean isOk(Apple apple) {
                return apple.getColor().equals("green")&&apple.getWeight() > weight;
        }
    }


