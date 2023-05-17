package com.geekster.Mapping_Practice.Controller;

import com.geekster.Mapping_Practice.Model.Laptop;
import com.geekster.Mapping_Practice.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptop")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping()
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }

    @GetMapping()
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @GetMapping("{id}")
    public Laptop getLaptop(@PathVariable Integer id){
        return laptopService.getLaptop(id);
    }

    @PutMapping()
    public void updateLaptop(@RequestBody Laptop laptop){
        laptopService.updateLaptop(laptop);
    }

    @DeleteMapping("{id}")
    public void deleteLaptop(@PathVariable Integer id){
        laptopService.deleteLaptop(id);
    }
}
