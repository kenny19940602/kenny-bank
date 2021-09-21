package com.yusys.bank.demo.config;

import com.yusys.bank.common.config.BaseSwaggerConfig;
import com.yusys.bank.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.yusys.bank.demo.controller")
                .title("bank-demo系统")
                .description("SpringCloud版本中的一些示例")
                .contactName("bank")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
