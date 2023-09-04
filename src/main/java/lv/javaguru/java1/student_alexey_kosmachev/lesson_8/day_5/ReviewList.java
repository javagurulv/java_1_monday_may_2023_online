package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;


import java.util.ArrayList;
import java.util.List;

class ReviewList {

    private List<ReviewObject> products;

    public ReviewList() { products = new ArrayList<>();}

    public void addMark(ReviewObject newObject) {
        this.products.add(newObject);
    }

    public int findMaxMark(List<ReviewObject> reviewMark) {
        int maxMark = reviewMark.get(0).getReviewMark();
        for (int i = 0; i < reviewMark.size(); i++) {
            ReviewObject review = reviewMark.get(i);
            if (review.getReviewMark() > maxMark) {
                maxMark = review.getReviewMark();
            }
        }
        return maxMark;
    }

    public int findMinMark(List<ReviewObject> subjectMarks) {
        int minMark = subjectMarks.get(0).getReviewMark();
        for (int i = 0; i < subjectMarks.size(); i++) {
            ReviewObject review = subjectMarks.get(i);
            if (review.getReviewMark() < minMark) {
                minMark = review.getReviewMark();
            }
        }
        return minMark;
    }



}
