package service;

import entity.MyUser;
import identityMap.MyRedis;
import mapper.MyUserMapper;

import java.sql.SQLException;

public class ApplicationService {
    private final MyUserMapper mapper;
    private final MyRedis redis;

    public ApplicationService(MyUserMapper mapper, MyRedis redis) {
        this.mapper = mapper;
        this.redis = redis;
    }

    public MyUser findUserByName(String name) throws SQLException {
        if(redis.getRepository().containsKey(name)){
            System.out.println("Запрос в Редис");
            return redis.getRepository().get(name);

        } else {
        System.out.println("Запрос в БД");
        MyUser user = mapper.findByName(name);
        redis.getRepository().put(user.getName(), user);
        return user;}
    }
}
