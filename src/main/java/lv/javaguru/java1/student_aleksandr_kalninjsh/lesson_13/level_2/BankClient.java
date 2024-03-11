package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_2;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient (String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }
    String getUid() {
        return uid;
    }
    String getFullName() {
        return fullName;
    }
}
