package Chain;

import Chain.interfaces.UserCheck;

public class UserExistCheck extends UserCheck {
    @Override
    public boolean check(String email, String pass) {
        if (email != null & pass!=null){
            return checkNext(email,pass);
        }else
        return false;
    }
}
