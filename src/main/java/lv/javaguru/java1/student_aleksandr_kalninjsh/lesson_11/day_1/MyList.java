package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_1;

public interface MyList<E> {

    void add(int index, E object); // Добавить элемент в вызывающий список в позицию, указанную в индексе
    E get(int index); // Возвращает объект, сохраненный в указанной позиции вызывающего списка
    E set(int index, E object); // Присваивает объект элементу находящемуся в списке в позиции индекс
    int size(); // Размер списка
}
