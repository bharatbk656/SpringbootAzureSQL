package com.rest.azure.springazurerestpoc;

import com.rest.azure.springazurerestpoc.model.UserDetails;
import com.rest.azure.springazurerestpoc.model.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("userDetails")
public class SpringAzureRestPocApplication {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @PostMapping("/addUserDetails")
    public UserDetails addUserDetails(@RequestBody UserDetails userDetails){
        return userDetailsRepository.save(userDetails);
    }
    @GetMapping("/getUserDetails")
    public List<UserDetails> addUserDetails(){
        return userDetailsRepository.findAll();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureRestPocApplication.class, args);
    }

}
