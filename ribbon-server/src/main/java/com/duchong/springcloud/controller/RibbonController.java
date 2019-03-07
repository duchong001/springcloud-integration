package com.duchong.springcloud.controller;

import com.duchong.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author DUCHONG
 * @since 2019-03-07 16:43
 **/
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/user/{id}")
    public User getUserByRibbon(@PathVariable("id") Long id){

        return restTemplate.getForObject("http://rest-provider/user/"+id,User.class);
    }
}
