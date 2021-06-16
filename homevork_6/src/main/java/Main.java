import conn.DBConnection;
import entity.MyUser;
import identityMap.MyRedis;
import mapper.MyUserMapper;
import service.ApplicationService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnection conn = new DBConnection();
        MyUserMapper mapper = new MyUserMapper(conn);
        mapper.findAll();
        System.out.println( mapper.findById(1));
        MyUser user = new MyUser("bbbb","fghdghdh",55,false);
        mapper.insert(user);

        MyRedis redis = new MyRedis();
        ApplicationService service = new ApplicationService(mapper, redis);
        System.out.println(service.findUserByName("bbbb"));
        System.out.println(service.findUserByName("bbbb"));
        System.out.println(service.findUserByName("bbbb"));


    }
}
