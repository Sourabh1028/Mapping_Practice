package com.geekster.Mapping_Practice.Controller;

import com.geekster.Mapping_Practice.Model.Address;
import com.geekster.Mapping_Practice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @GetMapping("{addressId}")
    public List<Address> getStudent(@RequestParam Long addressId){
        return addressService.getAddress(addressId);
    }

    @PutMapping("{addressId}")
    public String updateAddress(@RequestParam Long  addressId,@RequestBody Address address){
        return addressService.updateAddress(addressId,address);
    }

    @DeleteMapping(value = "{addressId}")
    public String deleteAddress(@PathVariable Long addressId){
        return addressService.deleteAddress(addressId);
    }
}
