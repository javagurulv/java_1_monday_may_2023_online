package lv.javaguru.java1.student_butrin_ilya.lesson_11.day1;

import java.util.ArrayList;
import java.util.List;

public class ListCreatorMetod implements ListCreator {
    @Override
    public List<Integer> createNewListInt (){
        List <Integer> name = new ArrayList<>();
        return name;
    }
    @Override
    public List<String> createNewListString (){
        List <String> name = new ArrayList<>();
        return name;
    }
}
