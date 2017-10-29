package com.easypark.parking.easypark;


public class Booking {


    private int id;

    private String matricule;

    private Visitor visitor;

    private String startTime;

    private String endTime;

    private Parking parking;

    private double totalPrice;

    private String realEndTime;

    private String realStartTime;

    private int state;

    private int numPlace;

    public Booking(int id, String matricule, Visitor visitor, String startTime, Parking parking, String endTime, double totalPrice, String realEndTime, String realStartTime, int state, int numPlace) {
        this.id = id;
        this.matricule = matricule;
        this.visitor = visitor;
        this.startTime = startTime;
        this.parking = parking;
        this.endTime = endTime;
        this.totalPrice = totalPrice;
        this.realEndTime = realEndTime;
        this.realStartTime = realStartTime;
        this.state = state;
        this.numPlace = numPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(String realEndTime) {
        this.realEndTime = realEndTime;
    }

    public String getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(String realStartTime) {
        this.realStartTime = realStartTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getNumPlace() {
        return numPlace;
    }

    public void setNumPlace(int numPlace) {
        this.numPlace = numPlace;
    }

}
