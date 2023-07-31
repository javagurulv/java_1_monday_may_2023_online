package lv.javaguru.java1.student_butrin_ilya.lesson_7.classwork.SchoolDiary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class MarkFileSaver {
    File markList = new File("C:\\Users\\User\\Desktop\\java_1_monday_may_2023_online\\src\\main\\java\\lv\\javaguru\\java1\\student_butrin_ilya\\lesson_7\\classwork\\SchoolDiary\\Marks.txt");
    public void saveMarksInFile(Diary marks)throws Exception {
            FileWriter writer = new FileWriter(markList, true);

        writer.write( marks.ilyaMarks.get(0).getObjekt() + " ");
        writer.write(Integer.toString((marks.ilyaMarks.get(marks.ilyaMarks.size()-1).getMark()))+ "\n");

            writer.close();
        }
    }

