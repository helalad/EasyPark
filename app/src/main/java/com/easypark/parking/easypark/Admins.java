package com.easypark.parking.easypark;


public class Admins extends User{

    private String email;

    public Admins(int id, String login, String password, String firstname, String lastname, boolean bloked, String email) {
        super(id, login, password, firstname, lastname, bloked);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
