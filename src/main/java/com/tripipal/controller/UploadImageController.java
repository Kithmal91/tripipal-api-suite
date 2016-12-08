package com.tripipal.controller;

import com.tripipal.model.Image;
import com.tripipal.repository.UploadImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kithmal on 12/7/16.
 */
@RestController
@RequestMapping("/image-upload")
public class UploadImageController {

    @Autowired
    UploadImageRepository uploadImageRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Image create(@RequestBody Image image){

        Image result = uploadImageRepository.save(image);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{imageId}")
    public Image get(@PathVariable String imageId){
        return uploadImageRepository.findOne(imageId);
    }
}
