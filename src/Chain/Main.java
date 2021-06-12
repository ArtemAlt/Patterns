package Chain;

import Chain.interfaces.UserCheck;

public class Main {
    public static void main(String[] args) {
        UserCheck userExist = new UserExistCheck();
        UserCheck userCheckRole = new UserRoleCheck();
        String email = "1@1.com";
        String pass = "khdhfkghdjfhg";

        userExist.link(userCheckRole);
        boolean result = userExist.check(email,pass);
    }
}
