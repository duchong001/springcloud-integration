package com.duchong.springcloud.service;

import com.duchong.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "rest-provider")
public interface FeignService {

    /**
     * 通过feign获取用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}")
    User getUserByFeign(@PathVariable("id") Long id);
}
