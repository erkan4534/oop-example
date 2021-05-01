package model;

public class User {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String notionalNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotionalNumber() {
        return notionalNumber;
    }

    public void setNotionalNumber(String notionalNumber) {
        this.notionalNumber = notionalNumber;
    }
}
