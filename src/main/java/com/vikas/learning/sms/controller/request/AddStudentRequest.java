package com.vikas.learning.sms.controller.request;

import lombok.Data;

@Data
public class AddStudentRequest {

    private String name;
    private String nationality;
    private String favouriteSubject;
    private String addressId;

}

