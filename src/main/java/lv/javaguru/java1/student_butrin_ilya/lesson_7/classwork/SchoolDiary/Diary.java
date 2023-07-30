package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork.SchoolDiary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diary {
    List <Mark> ilyaMarks = new ArrayList<>();
    public void addMark(String object , int mark) {
        ilyaMarks.add(new Mark(object, mark));
    }

    public int maxMarkForObject(String object) {

        List<Integer> allMarks = allMarksForObject(object, ilyaMarks);
        return maxMark(allMarks);

    }
    public int minMarkForObject(String object) {
        List<Integer> allMarks = allMarksForObject(object, ilyaMarks);
        return minMark(allMarks);
    }
    public double AverageMarkForObject(String object) {

        List<Integer> allMarks = allMarksForObject(object, ilyaMarks);
        return averageMark(allMarks);
    }
    public double AverageAllMark () {
        double sum = 0;
        for (int i = 0; i < ilyaMarks.size(); i++) {
        sum = sum + ilyaMarks.get(i).getMark();
        }
        return (double)sum / ilyaMarks.size();
    }

    public List<Integer> allMarksForObject(String object, List<Mark> markList) {
        List<Integer> marksForObject = new ArrayList<Integer>();
        for (int i = 0; i < markList.size(); i++) {
            if (object.equals(markList.get(i).getObjekt())) {
                marksForObject.add(markList.get(i).getMark());
            }
        }
        return marksForObject;
    }

    private int maxMark(List<Integer> marksObjekt) {
        int max = marksObjekt.get(0);
        for (int i = 0; i < marksObjekt.size(); i++) {
            if (max < marksObjekt.get(i)) {
                max = marksObjekt.get(i);
            }
        }
            return max;
    }
    private int minMark(List<Integer> marksObjekt) {
        int min = marksObjekt.get(0);
        for (int i = 0; i < marksObjekt.size(); i++) {
            if (min > marksObjekt.get(i)) {
                min = marksObjekt.get(i);
            }
        }
            return min;
    }
    private double averageMark(List<Integer> marksObjekt) {
        int sum = 0;
        for (int i = 0; i < marksObjekt.size(); i++) {
           sum = sum + marksObjekt.get(i);
            }
        return (double) sum / marksObjekt.size();
    }
}