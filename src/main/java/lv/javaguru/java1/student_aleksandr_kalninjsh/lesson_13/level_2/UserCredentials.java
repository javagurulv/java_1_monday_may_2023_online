package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_2;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials (List<Role>roles) {
        this.roles = roles;
    }
    List<Role>getRoles() {
        return roles;
    }
    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
