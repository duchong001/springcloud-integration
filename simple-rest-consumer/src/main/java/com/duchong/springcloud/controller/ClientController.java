package com.duchong.springcloud.controller;

import com.duchong.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author DUCHONG
 * @since 2019-03-05 22:33
 **/

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${request.url}")
    private String requestUrl;

    @GetMapping("/consumer/{id}")
    public User getRemoteUser(@PathVariable("id") Long id){
        return restTemplate.getForObject(requestUrl+id,User.class);
    }
}
