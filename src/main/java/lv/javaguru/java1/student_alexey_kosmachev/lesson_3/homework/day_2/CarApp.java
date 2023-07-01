package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_2;


class CarApp {
    public static void main(String[] args) {
        Car firstcar = new Car("saab","black",2000);  //Значения первой машины
        Car secondcar = new Car("skoda","white", 1000 ); //Значения второй машины
        Car thirdcar = new Car("audi", "green", 5000.500); //Значения третьей машины

        System.out.println("Decribe your first car: "); //Вывод первой машины
        System.out.println(firstcar.getType());
        System.out.println(firstcar.getColour());
        System.out.println(firstcar.getPrice());

        firstcar.setType("honda");  //вносим изменения
        firstcar.setColour("purple");
        firstcar.setPrice(1500);
        System.out.println("Oops we have an another data: "); //Вывод изменений для первой машины
        System.out.println(firstcar.getType());
        System.out.println(firstcar.getColour());
        System.out.println(firstcar.getPrice());

        System.out.println("Decribe your second car: "); //Вывод второй машины
        System.out.println(secondcar.getType());
        System.out.println(secondcar.getColour());
        System.out.println(secondcar.getPrice());

        secondcar.setType("toyota");  //вносим изменения
        secondcar.setColour("red");
        secondcar.setPrice(10000);
        System.out.println("Oops we have an another data: "); //Вывод изменений для второй машины
        System.out.println(secondcar.getType());
        System.out.println(secondcar.getColour());
        System.out.println(secondcar.getPrice());

        System.out.println("Decribe your third car: "); //Вывод третьей машины
        System.out.println(thirdcar.getType());
        System.out.println(thirdcar.getColour());
        System.out.println(thirdcar.getPrice());

        thirdcar.setType("citroen");  //вносим изменения
        thirdcar.setColour("blue");
        thirdcar.setPrice(4000.200);
        System.out.println("Oops we have an another data: "); //Вывод изменений для третьей машины
        System.out.println(thirdcar.getType());
        System.out.println(thirdcar.getColour());
        System.out.println(thirdcar.getPrice());






    }


}
