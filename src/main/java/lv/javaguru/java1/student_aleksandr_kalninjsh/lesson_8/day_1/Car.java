package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_1;

class Car {

    String carMake;
    String model;
    String bodyType;
    String engine;

    public Car(String carMake, String model, String bodyType, String engine) {
        this.carMake = carMake;
        this.model = model;
        this.bodyType = bodyType;
        this.engine = engine;
    }

    String getCarMake() {
        return carMake;
    }
    String getModel() {
        return model;
    }
    String getBodyType() {
        return bodyType;
    }
    String getEngine() {
        return engine;
    }

}
