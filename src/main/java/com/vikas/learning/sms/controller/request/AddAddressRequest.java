package com.vikas.learning.sms.controller.request;

import lombok.Data;

@Data
public class AddAddressRequest {

    private String line1;
    private String line2;
    private String city;
    private String pin;
    private String country;

}