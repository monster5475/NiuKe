package com.shixi.test.serial;

import java.io.Serializable;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class Address implements Serializable {
    private String province;
    private String city;
    private String county;

    public Address(String province, String city, String county){
        this.province = province;
        this.city = city;
        this.county = county;
    }

    @Override
    public String toString() {
        String res = "{省份: " +province +", 城市: "+city +", 国家: " +county + "}";
        return res;
    }
}
