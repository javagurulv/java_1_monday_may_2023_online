package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService{

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
