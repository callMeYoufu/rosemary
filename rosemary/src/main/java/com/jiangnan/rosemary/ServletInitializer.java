package com.jiangnan.rosemary;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author  jiangNan
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RosemaryApplication.class);
    }

    /*
        https://www.jianshu.com/p/cb5cb5937686 参考
        https://blog.csdn.net/qq_28289405/article/details/81279742 参考
     */
}
