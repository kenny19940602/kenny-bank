package com.yusys.bank.admin.config;

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
                .apiBasePackage("com.yusys.bank.admin.controller")
                .title("bank后台系统")
                .description("bank后台相关接口文档")
                .contactName("kenny")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
