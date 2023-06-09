package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_5.homework.day_6;

public class StudentReportCard {
    String name;
    String lastName;
    int algebraMark;
    int biologyMark;
    int englishMark;
    int geographyMark;

    int numbers;


    public StudentReportCard(String name, String lastName, int algebraMark, int biologyMark, int englishMark, int geographyMark) {
        this.name = name;
        this.lastName = lastName;
        this.algebraMark = algebraMark;
        this.biologyMark = biologyMark;
        this.englishMark = englishMark;
        this.geographyMark = geographyMark;
    }

    public double calculateAverageMark(int algebraMark, int biologyMark, int englishMark, int geographyMark) {
        return (algebraMark + biologyMark + englishMark + geographyMark) / (double) 4;
    }

    public double calculateAverageMarkFor(int algebraMark, int biologyMark, int englishMark, int geographyMark) {
        int[] num = new int[]{algebraMark,biologyMark,englishMark,geographyMark};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        return (double) (sum / num.length);
    }
}





