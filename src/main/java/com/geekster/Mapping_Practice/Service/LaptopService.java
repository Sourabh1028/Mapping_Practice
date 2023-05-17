package com.geekster.Mapping_Practice.Service;

import com.geekster.Mapping_Practice.Model.Laptop;
import com.geekster.Mapping_Practice.Repositary.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptop(Integer id) {
        return laptopRepo.getById(id);
    }

    public void updateLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public void deleteLaptop(Integer id) {
        laptopRepo.deleteById(id);
    }
}

