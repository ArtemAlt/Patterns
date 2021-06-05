package Builder.entity;

public class User {
    private String name;
    private String password;
    private Integer accountValue;
    private String token;


    public static class Builder{
        private User newUser;

        public Builder(){
            newUser= new User();
        }
        public Builder setName(String name){
            newUser.name=name;
            return this;
        }

        public Builder setPassword(String password){
            newUser.password=password;
            return this;
        }
        public Builder setAccountValue(Integer value){
            newUser.accountValue=value;
            return this;
        }

        public Builder setToken(String token){
            newUser.token=token;
            return this;
        }

        public User build(){
            return  newUser ;
        }

    }

}
