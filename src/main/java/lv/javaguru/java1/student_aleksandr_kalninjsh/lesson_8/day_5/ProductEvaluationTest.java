package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

class ProductEvaluationTest {

    public static void main(String[] args) {
        ProductEvaluationTest productEvaluationTest = new ProductEvaluationTest();
        productEvaluationTest.shouldAddOneReview();

    }

    public void shouldAddOneReview() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author", "Leave a review", 1);
        if (productEvaluation.getReviewsCount() == 1) {
            System.out.println("Add review test = OK");
        } else {
            System.out.println("Add review test = FAIL");
        }
    }

    public void shouldAddTwoReviews() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        if (productEvaluation.getReviewsCount() == 2) {
            System.out.println("Add review test = OK");
        } else {
            System.out.println("Add review test = FAIL");
        }
    }


}
