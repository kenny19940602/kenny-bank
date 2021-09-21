package com.yusys.bank.demo.controller;

import com.yusys.bank.common.api.CommonResult;
import com.yusys.bank.demo.dto.UmsAdminLoginParam;
import com.yusys.bank.demo.service.FeignAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign调用bank-admin接口示例
 */
@Api(tags = "FeignAdminController", description = "Feign调用bank-admin接口示例")
@RestController
@RequestMapping("/feign/admin")
public class FeignAdminController {
    @Autowired
    private FeignAdminService adminService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam loginParam) {
        return adminService.login(loginParam);
    }


}
