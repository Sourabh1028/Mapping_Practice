package com.geekster.Mapping_Practice.Service;

import com.geekster.Mapping_Practice.Model.Address;
import com.geekster.Mapping_Practice.Repositary.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;


    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAddress(Long addressId) {
        if(addressId == null){
            return addressRepo.findAll();
        }else{
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressRepo.findById(addressId).get());
            return addressList;
        }
    }

    public String updateAddress(Long addressId, Address address) {
        Optional<Address> list = addressRepo.findById(addressId);
        address.setAddressId(addressId);

        if(list.isEmpty()){
            return "address with addressId "+ addressId + " not found";
        }else{
            addressRepo.save(address);
            return "address with addressId "+ addressId + " updated successfully";
        }
    }

    public String deleteAddress(Long addressId) {
        Optional<Address> list = addressRepo.findById(addressId);

        if(list.isEmpty()){
            return "address with addressId "+ addressId + " not found";
        }else{
            addressRepo.deleteById(addressId);
            return "address with addressId "+ addressId + " deleted successfully";
        }
    }
}
