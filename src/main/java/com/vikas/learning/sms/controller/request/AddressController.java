package com.vikas.learning.sms.controller.request;

import com.vikas.learning.sms.domain.Address;
import com.vikas.learning.sms.domain.Student;
import com.vikas.learning.sms.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping(value = "/address", consumes = "application/json",
            produces = "application/json")
    public Address addStudent(@RequestBody AddAddressRequest addAddressRequest) {
        return addressService.addAddress(addAddressRequest);
    }

    @GetMapping(value = "/address")
    public List<Address> getAddress() {
        return addressService.getAddress();
    }

    @GetMapping(value = "/address/{city}")
    public Address getAddressDetailsByName(@PathVariable String city) {
        return addressService.getAddressDetailsByCity(city);
    }

}
