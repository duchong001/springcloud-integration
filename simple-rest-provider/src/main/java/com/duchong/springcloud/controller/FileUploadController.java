package com.duchong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件上传控制器
 * @author DUCHONG
 * @since 2020-09-16 16:10
 **/
@RestController
@Slf4j
public class FileUploadController {


    /***
     * 上传文件
     * @param file
     * @return
     */
    @RequestMapping(value = "/fileUpload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestPart("file") MultipartFile file, @RequestParam("name") String name ) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = System.getProperty("user.dir")+ "/upload/"
                        + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        log.info("文件上传成功---fileName---{}",file.getOriginalFilename());
        return file.getOriginalFilename();
    }
}
