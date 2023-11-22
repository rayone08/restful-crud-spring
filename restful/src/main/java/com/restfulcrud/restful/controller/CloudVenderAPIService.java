package com.restfulcrud.restful.controller;

import com.restfulcrud.restful.model.CloudVender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvender")
public class CloudVenderAPIService {

    CloudVender cloudVender;
    @GetMapping("{venderId}")
    public CloudVender getDetails(String venderId){
        return cloudVender;
//                CloudVender("1","Harish","Batticaloa","07XXXXXXXX");
    }

    @PostMapping
    public String createVenderDetails(@RequestBody CloudVender cloudVender){
        this.cloudVender = cloudVender;
        return ("ok");
    }
    @PutMapping
    public String updateVenderDetails(@RequestBody CloudVender cloudVender){
        this.cloudVender = cloudVender;
        return ("Updated");
    }

    @DeleteMapping("{venderId}")
    public String deleteVenderDetails(String venderId){
        this.cloudVender = null;
        return ("Deleted");
    }
}
