package lv.javaguru.java1.student_butrin_ilya.lesson_15;

    class NotThreadSafeIdGeneratorComplexState {

        private int id;
        private boolean even;

        public int nextId() {
            id++;
            this.even = isEven(id);
            return id;
        }

        public boolean isEven() {
            return this.even;
        }

        public int getId() {
            return id;
        }

        private boolean isEven(int number) {
            return number % 2 == 0;
        }

    }


