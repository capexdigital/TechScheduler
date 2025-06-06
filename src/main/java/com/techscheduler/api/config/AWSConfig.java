package com.techscheduler.api.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AWSConfig {

    @Value("${aws-region}")
    private String awsRegion;

    @Bean
    public AmazonS3 createInstance(){
        return AmazonS3ClientBuilder.standard()
                .withRegion(awsRegion)
                .build();
    }
}
