package com.yusys.bank.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.yusys.bank.mbg.mapper","com.yusys.bank.admin.dao"})
public class MyBatisConfig {
}
