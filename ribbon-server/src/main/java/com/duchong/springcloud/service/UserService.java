package com.duchong.springcloud.service;

import com.duchong.springcloud.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * hystrix get user service
 *
 * @author DUCHONG
 * @since 2020-05-12 16:55
 **/
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod ="getUserFallBack" )
    public User getUserByRibbon(Long id) throws Exception{

        TimeUnit.SECONDS.sleep(5);
        return restTemplate.getForObject("http://rest-provider/user/"+id,User.class);
    }

    public User getUserFallBack(Long id){
        return new User().setAge(-1).setId(0L).setName("unknown");
    }
}
