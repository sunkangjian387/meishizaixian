package com.gaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gaoshu.mapper")
@EnableCaching
public class FoodOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodOnlineApplication.class, args);
    }

}
