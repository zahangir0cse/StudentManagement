package com.example.zahangiralam.model;

/**
 * Created by Zahangir Alam on 2017-11-25.
 */

public class Address {
    private String roadNo;
    private String houseNo;
    private String city;

    public Address() {
    }

    public Address(String roadNo, String houseNo, String city) {
        this.roadNo = roadNo;
        this.houseNo = houseNo;
        this.city = city;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
