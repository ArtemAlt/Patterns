package Chain.interfaces;

public abstract class UserCheck {
    private UserCheck next;

    public UserCheck link(UserCheck check){
        this.next=check;
        return next;
    }

    public abstract boolean check (String email, String pass);

    protected boolean checkNext(String email, String pass){
        if (next==null) {
        return true;
        }
        return next.check(email,pass);
    }

}
