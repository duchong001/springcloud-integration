package com.duchong.springcloud.service;

import com.duchong.springcloud.config.MultipartSupportConfig;
import com.duchong.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "rest-provider",configuration = MultipartSupportConfig.class)
public interface FeignService {

    /**
     * 通过feign获取用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}")
    User getUserByFeign(@PathVariable("id") Long id);

    /**
     * 测试文件上传
     * @param file
     * @param name
     * @return
     */
    @RequestMapping(value = "/fileUpload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile(@RequestPart("file") MultipartFile file, @RequestParam("name") String name);

}
