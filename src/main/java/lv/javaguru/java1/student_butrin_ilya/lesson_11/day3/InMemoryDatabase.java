package lv.javaguru.java1.student_butrin_ilya.lesson_11.day3;

public class InMemoryDatabase implements ProductDatabase{
    Product[] dataBase = new Product[0];


    public Product[] getDataBase() {
        return dataBase;
    }

    @Override
    public void save (Product product) {
    Product[] dataBaseNew = new Product[dataBase.length + 1];
    for (int i = 0; i < dataBaseNew.length-1; i++){
        dataBaseNew[i] = dataBase[i];
    }
    dataBaseNew[dataBaseNew.length-1] = product;
    dataBase = dataBaseNew;
    }
    @Override
    public Product findByTitle(String productTitle){
        this.dataBase = dataBase;
        Product rezult = null;
        for (int i = 0; i < dataBase.length ; i++){
            if(dataBase[i].getName().equals(productTitle))
                rezult = dataBase[i];
        }
        System.out.println(rezult);
        return rezult;
    }

}
