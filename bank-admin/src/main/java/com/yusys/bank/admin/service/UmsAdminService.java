package com.yusys.bank.admin.service;

import com.yusys.bank.common.api.CommonResult;
import com.yusys.bank.common.domain.UserDto;
import com.yusys.bank.mbg.model.UmsAdmin;

/**
 * 后台管理员Service
 */
public interface UmsAdminService {

    UserDto loadUserByUsername(String username);


    UmsAdmin getAdminByUsername(String username);

    CommonResult login(String username, String password);
}
