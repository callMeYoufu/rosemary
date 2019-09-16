package com.jiangnan.rosemary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.jiangnan.rosemary"})
/**
 * 启动类
 * @author jiangNan
 */
public class RosemaryApplication {

    public static void main(String[] args) {
        // 扫描包下的所有组件
        SpringApplication.run(RosemaryApplication.class, args);
    }

}
