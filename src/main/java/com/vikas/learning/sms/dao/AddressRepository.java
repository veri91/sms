package com.vikas.learning.sms.dao;

import com.vikas.learning.sms.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,String> {

    Address getByCity(String city);
}
