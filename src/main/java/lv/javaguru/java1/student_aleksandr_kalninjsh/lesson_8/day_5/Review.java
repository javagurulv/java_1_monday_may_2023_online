package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

class Review {

    String nickName;
    String reviewText;
    int reviewMark;

    public Review(String nickName, String reviewText, int reviewMark) {
        this.nickName = nickName;
        this.reviewText = reviewText;
        this.reviewMark = reviewMark;
    }
    String getNickName() {
        return nickName;
    }
    String getReviewText() {
        return reviewText;
    }
    int getReviewMark() {
        return reviewMark;
    }

}

