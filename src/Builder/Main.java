package Builder;

import Builder.entity.User;

public class Main {
User user = new User.Builder()
        .setName("Vasya")
        .setPassword("4gtyuiokjhg")
        .setAccountValue(1000)
        .setToken("khdfkghkdhfg")
        .build();
}
