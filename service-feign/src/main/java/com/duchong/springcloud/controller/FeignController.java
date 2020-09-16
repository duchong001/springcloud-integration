package com.duchong.springcloud.controller;

import com.duchong.springcloud.pojo.User;
import com.duchong.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.lang.model.element.NestingKind;

/**
 * @author DUCHONG
 * @since 2019-03-25 16:25
 **/
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/user/{id}")
    public User getUserByFeignService(@PathVariable("id") Long id) {

        return feignService.getUserByFeign(id);
    }

    @RequestMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile file, @RequestParam("name") String name ) {

        return feignService.uploadFile(file,name);
    }

}
