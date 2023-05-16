package com.geekster.Mapping_Practice.Repositary;

import com.geekster.Mapping_Practice.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
