package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService{

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
