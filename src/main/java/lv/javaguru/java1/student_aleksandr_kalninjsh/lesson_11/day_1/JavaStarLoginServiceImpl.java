package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
