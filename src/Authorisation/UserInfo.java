package Authorisation;

public class UserInfo {
    String name;
    String surname;
    String age;

    public UserInfo(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("user info:\nname: " + name + "\nsurname: " + surname + "\nage: " + age);
    }
}
