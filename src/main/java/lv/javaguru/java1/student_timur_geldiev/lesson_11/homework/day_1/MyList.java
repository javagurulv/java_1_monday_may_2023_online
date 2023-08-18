package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_1;

public interface MyList<E> {

    void add(E element); //добавить новый элемент
    void add(int index, E element); //Добавляет элемент по индексу
    E get(int index); //Возвращает элемент по индексу
    E remove(int index); //Удаляет элемент по индексу
    int size(); //Размер списка

}
