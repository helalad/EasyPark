package com.easypark.parking.easypark;


public class Parking {
  private int  id;
          private String  name;
   private String location;
     private double  price;
    private  String description;
         private int   latitude;
   private int langitude;
           private String starthour;
    private  String endhour;
     private boolean  on_work;
    private AgentPark agentPark;
    private int nbPlace;

    public Parking(int id, int nbPlace, AgentPark agentPark, boolean on_work, String endhour, int langitude, String starthour, int latitude, String description, double price, String location, String name) {
        this.id = id;
        this.nbPlace = nbPlace;
        this.agentPark = agentPark;
        this.on_work = on_work;
        this.endhour = endhour;
        this.langitude = langitude;
        this.starthour = starthour;
        this.latitude = latitude;
        this.description = description;
        this.price = price;
        this.location = location;
        this.name = name;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLangitude() {
        return langitude;
    }

    public void setLangitude(int langitude) {
        this.langitude = langitude;
    }

    public String getStarthour() {
        return starthour;
    }

    public void setStarthour(String starthour) {
        this.starthour = starthour;
    }

    public String getEndhour() {
        return endhour;
    }

    public void setEndhour(String endhour) {
        this.endhour = endhour;
    }

    public boolean isOn_work() {
        return on_work;
    }

    public void setOn_work(boolean on_work) {
        this.on_work = on_work;
    }

    public AgentPark getAgentPark() {
        return agentPark;
    }

    public void setAgentPark(AgentPark agentPark) {
        this.agentPark = agentPark;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
}
