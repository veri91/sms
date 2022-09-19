package com.vikas.learning.sms.service;

import com.vikas.learning.sms.controller.request.AddAddressRequest;
import com.vikas.learning.sms.domain.Address;

import java.util.List;

public interface AddressService {
    Address getAddressDetailsByCity(String city);

    Address addAddress(AddAddressRequest addAddressRequest);

    List<Address> getAddress();


}
