package com.java.se.lesson1;

public class TouristPermit {
    public String country;
    public String duration_in_day;
    public String cost_in_euro;
    private String average_temp;
    private String flight_time;

    //public void go()(
    public String getCountry () {
        return country;
    }

    public void setCountry (String country){
        this.country = country;
    }

    public String getDuration_in_day () {
        return duration_in_day;
    }

    public void setDuration_in_day (String duration_in_day){
        this.duration_in_day = duration_in_day;
    }

    public String getCost_in_euro () {
        return cost_in_euro;
    }

    public void setCost_in_euro (String cost_in_euro){
        this.cost_in_euro = cost_in_euro;
    }

    public String getAverage_temp () {
        return average_temp;
    }

    public void setAverage_temp (String average_temp){
        this.average_temp = average_temp;
    }

    public String getFlight_time () {
        return flight_time;
    }

    public void setFlight_time (String flight_time){
        this.flight_time = flight_time;

    }
}

