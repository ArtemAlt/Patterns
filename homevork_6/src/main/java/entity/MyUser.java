package entity;

import java.util.Objects;

public class MyUser {
    private String name;
    private String password;
    private int age;
    private boolean status;

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyUser user = (MyUser) o;
        return age == user.age && status == user.status && Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, age, status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public MyUser(String name, String password, int age, boolean status) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.status = status;
    }
}
