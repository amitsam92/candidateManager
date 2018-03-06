package com.samdarshi.octusProject.vo;

/**
 * Created by samdarshi on 2/3/18.
 */

public class AddressVo {
    private String city;
    private String country;

    protected AddressVo(){}

    public AddressVo(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
