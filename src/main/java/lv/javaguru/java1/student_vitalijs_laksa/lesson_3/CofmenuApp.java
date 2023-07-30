package lv.javaguru.java1.student_vitalijs_laksa.lesson_3;

public class CofmenuApp {

    public static void main(String[] args) {

        Cofmenu latte = new Cofmenu("Latte", 250, 2.3);
        Cofmenu espresso = new Cofmenu("Espresso", 50, 1.7);
        Cofmenu americano = new Cofmenu("Americano", 200, 2);
        Cofmenu mocha = new Cofmenu("Black Coffee", 250, 2.3);
        Cofmenu white = new Cofmenu("Black Cofee", 200, 2);
        Cofmenu irish = new Cofmenu("Irish", 200, 2.2);


        System.out.println("Coffee MENU: ");
        System.out.println(latte.name + " " + latte.size + "ml - " + latte.price + " eur");
        System.out.println(espresso.name + " " + espresso.size + "ml - " + espresso.price + " eur");
        System.out.println(americano.name + " " + americano.size + "ml - " + americano.price + " eur");
        System.out.println(mocha.name + " " + mocha.size + "ml - " + mocha.price + " eur");
        System.out.println(white.name + " " + white.size + "ml - " + white.price + " eur");
        System.out.println(irish.name + " " + irish.size + "ml - " + irish.price + " eur");


    }
}
