package com.duchong.springcloud.controller;

import com.duchong.springcloud.pojo.User;
import com.duchong.springcloud.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.lang.model.element.NestingKind;

/**
 * @author DUCHONG
 * @since 2019-03-25 16:25
 **/
@RestController
@Slf4j
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/user/{id}")
    public User getUserByFeignService(@PathVariable("id") Long id) {

        return feignService.getUserByFeign(id);
    }

    @RequestMapping(value = "/fileUpload")
    public String fileUpload(@RequestPart("file") MultipartFile file, @RequestParam("name") String name ) {

        log.info("文件上传---fileName---{}",file.getOriginalFilename());
        return feignService.uploadFile(file,name);
    }

}
