package com.duchong.springcloud.controller;

import com.duchong.springcloud.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

/**
 * @author DUCHONG
 * @since 2019-03-05 22:28
 **/
@RestController
public class UserController {


    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") Long id){

        return new User().setId(id).setAge(new Random().nextInt(10)).setName(UUID.randomUUID().toString());
    }
}
