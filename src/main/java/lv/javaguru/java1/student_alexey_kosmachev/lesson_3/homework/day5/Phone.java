package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day5;

//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Phone.
public class Phone {
    String model;

    Phone(String newModel) { // Book to Phone
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
