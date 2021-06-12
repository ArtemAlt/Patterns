package Chain;

import Chain.interfaces.UserCheck;

public class UserRoleCheck extends UserCheck {
     private RoleRepository repository;
    @Override
    public boolean check(String email, String pass) {
       String  role = repository.getRole(email);
        return role != null;

    }
}
