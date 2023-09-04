package lv.javaguru.java1.student_alexey_kosmachev.lesson_8.day_5;

class ReviewObject {
    
    private String nick;
    private String productName;
    private String reviewText;
    private int reviewMark;

    
    public ReviewObject(String nick, String productName, String reviewText, int reviewMark ) {
        this.nick = nick;
        this.productName = productName;
        this.reviewText = reviewText;
        this.reviewMark = reviewMark;
    }

    public String getNick() { return nick; }
    public String getProductName() { return productName;}
    public String getReviewText() { return reviewText; }
    public int getReviewMark() { return reviewMark; }
}
