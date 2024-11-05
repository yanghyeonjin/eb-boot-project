package com.ohgiraffers.elasticbeans_boot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElasticbeansBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticbeansBootApplication.class, args);
    }

    /**
     * ModelMapper 의존성 주입(config용 클래스 만들어서 하는걸 권장)
     * 1. 매번 new ModelMapper() 하지 않아도 된다.
     * 2. Bean으로 등록하면 싱글톤으로 관리되기 때문에 메모리적으로 낭비가 덜하다.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
