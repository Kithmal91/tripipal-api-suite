package com.tripipal;

import com.tripipal.model.Image;
import com.tripipal.repository.UploadImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kithmal on 12/6/16.
 */
@SpringBootApplication
public class UploadImageInvoker {

    public static void main(String[] args) {
        SpringApplication.run(UploadImageInvoker.class);
    }

}
