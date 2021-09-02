package identityMap;

import entity.MyUser;

import java.util.HashMap;
import java.util.Map;

public class MyRedis {
    private final Map<String,MyUser> repository = new HashMap<>();

    public Map<String,MyUser>  getRepository() {
        return repository;
    }


}
