package Chain;

import java.util.HashMap;
import java.util.Map;

public class RoleRepository {
    private Map<Integer,String> storage = new HashMap<>();

    public void saveRole(String role){
        storage.put(1,"NEW_USER");
    }

    public String getRole(String email){
        return storage.get(1);
    }

    public RoleRepository getStorage() {
        return this;
    }
}
