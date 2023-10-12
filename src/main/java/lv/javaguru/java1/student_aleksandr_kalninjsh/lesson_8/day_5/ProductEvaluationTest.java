package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_5;

class ProductEvaluationTest {

    public static void main(String[] args) {

        ProductEvaluationTest test = new ProductEvaluationTest();
        test.addReview();
        test.removeReview();
    }



    public void addReview() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.addReview("Author1", "Leave a review", 1);
        productEvaluation.addReview("Author2", "Leave a review", 2);
        productEvaluation.addReview("Author3", "Leave a review", 3);
        productEvaluation.addReview("Author4", "Leave a review", 4);
        productEvaluation.addReview("Author5", "Leave a review", 5);
        if (productEvaluation.getReviewsCount() == 5) {
            System.out.println("Add review test = OK");
        } else {
            System.out.println("Add review test = FAIL");
        }
    }

    public void removeReview() {
        ProductEvaluation productEvaluation = new ProductEvaluation();
        productEvaluation.removeReview("Author5", "Leave a review", 5);
        if (productEvaluation.getReviewsCount() == 5) {
            System.out.println("Remove review test = OK");
        } else {
            System.out.println("Remove review test = FAIL");
        }
    }


}



