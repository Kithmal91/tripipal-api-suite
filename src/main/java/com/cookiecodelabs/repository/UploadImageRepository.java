package com.tripipal.repository;

import com.tripipal.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Kithmal on 12/6/16.
 */
public interface UploadImageRepository extends MongoRepository<Image, String> {
}
