package models;

public class UserModel {

    private int id;
    private String name;
    private String surname;
    private int age;

    public UserModel(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public UserModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
