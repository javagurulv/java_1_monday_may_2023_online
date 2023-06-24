package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day5;

class Phone {
    String model;

    public Phone(String model) {
        this.model = model;
    }

       public String getModel() {
            return model;
        }

}

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }

