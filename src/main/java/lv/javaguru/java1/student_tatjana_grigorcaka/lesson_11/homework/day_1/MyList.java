package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_1;

public interface MyList {

    void add( Object o); //This method adds an object o at the end of the arraylist.
    void add(int index, Object o); //It adds the object o at the specified index in the ArrayList.

    void remove(Object o); //Removes the object o from the ArrayList.

    void remove(int index); //Removes element from a given index.

    Object set(int index, Object o); //Used for updating an element. It replaces the element present at the specified index with the object o.

    Object get(int index); //It returns the object of list which is present at the specified index.

    int size(); //It returns the size of the ArrayList (Number of elements of the list).

    void clear(); //It is used for removing all the elements of the array list in one go.
}


