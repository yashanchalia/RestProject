package com.yash.database.models;

import javax.persistence.Embeddable;

/**
 * Created by Yash on 9/6/2015.
 */
@Embeddable
public class Address {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
