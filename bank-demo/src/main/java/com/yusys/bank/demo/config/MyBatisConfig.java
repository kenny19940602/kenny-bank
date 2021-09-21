package com.yusys.bank.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan("com.yusys.bank.mbg.mapper")
public class MyBatisConfig {
}
