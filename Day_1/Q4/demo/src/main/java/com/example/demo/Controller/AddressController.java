package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject() {
        Address obj = new Address();
        obj.setName("Haribaskar");
        obj.setDoorNo(707);
        obj.setStreetName("Street 63");
        obj.setPincode(600007);
        obj.setArea("Sample");
        obj.setDistrict("District 8");
        obj.setState("State 107");
        obj.setCountry("Wakanda");
        return obj;
    }
}
