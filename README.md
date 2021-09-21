# kenny-bank




## 项目介绍

`kenny-bank`是一套微服务商城系统，采用了 Spring Cloud Hoxton & Alibaba、Spring Boot 2.3、Oauth2、MyBatis、 


## 组织结构

``` lua
kenny-bank
├── bank-common -- 工具类及通用代码模块
├── bank-mbg -- MyBatisGenerator生成的数据库操作代码模块
├── bank-auth -- 基于Spring Security Oauth2的统一的认证中心
├── bank-gateway -- 基于Spring Cloud Gateway的微服务API网关服务
├── bank-admin -- 后台管理系统服务
└── bank-demo -- 微服务远程调用测试服务
```
