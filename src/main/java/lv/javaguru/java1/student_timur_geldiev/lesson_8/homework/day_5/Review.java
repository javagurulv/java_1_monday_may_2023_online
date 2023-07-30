package lv.javaguru.java1.student_timur_geldiev.lesson_8.homework.day_5;

class Review {

    String product;
    String nickname;
    String reviewText;
    int rate;


    public Review(String product, String nickname, String reviewText, int rate){
        this.product = product;
        this.nickname = nickname;
        this.reviewText = reviewText;
        this.rate = rate;
    }
    public String getNickname(){
        return nickname;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getRate() {
        return rate;
    }
    public String getProduct(){
        return product;
    }
    public String toString(){
        return "Product " + product +
                ", Nickname: " + nickname +
                ", Review: " + reviewText +
                ", Mark: " + rate;
    }

}
