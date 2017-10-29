package com.easypark.parking.easypark;


public class AgentPark extends User{
private String phone;

    public AgentPark(int id, String login, String password, String firstname, String lastname, boolean bloked, String phone) {
        super(id, login, password, firstname, lastname, bloked);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
