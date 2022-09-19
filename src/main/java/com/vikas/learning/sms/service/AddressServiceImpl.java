package com.vikas.learning.sms.service;

import com.vikas.learning.sms.controller.request.AddAddressRequest;
import com.vikas.learning.sms.dao.AddressRepository;
import com.vikas.learning.sms.domain.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address getAddressDetailsByCity(String city) {
        return addressRepository.getByCity(city);
    }

    @Override
    public Address addAddress(AddAddressRequest addAddressRequest) {
        return addressRepository.save(getAddress(addAddressRequest));
    }

    @Override
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }

    private Address getAddress(AddAddressRequest addAddressRequest) {
        return new Address(UUID.randomUUID().toString(), addAddressRequest.getLine1(),
                addAddressRequest.getLine2(),
                addAddressRequest.getCity(),
                addAddressRequest.getPin(),
                addAddressRequest.getCountry());

    }

}
