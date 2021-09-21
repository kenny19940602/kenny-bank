package com.yusys.bank.admin.service.impl;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.StrUtil;
import com.yusys.bank.admin.service.AuthService;
import com.yusys.bank.admin.service.UmsAdminService;
import com.yusys.bank.common.api.CommonResult;
import com.yusys.bank.common.api.ResultCode;
import com.yusys.bank.common.constant.AuthConstant;
import com.yusys.bank.common.domain.UserDto;
import com.yusys.bank.common.exception.Asserts;
import com.yusys.bank.mbg.mapper.UmsAdminMapper;
import com.yusys.bank.mbg.model.UmsAdmin;
import com.yusys.bank.mbg.model.UmsAdminExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * UmsAdminService实现类
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UmsAdminMapper adminMapper;
    @Autowired
    private AuthService authService;

    @Override
    public UserDto loadUserByUsername(String username){
        //获取用户信息
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
//            List<UmsRole> roleList = getRoleList(admin.getId());
            UserDto userDTO = new UserDto();
            BeanUtils.copyProperties(admin,userDTO);
//            if(CollUtil.isNotEmpty(roleList)){
//                List<String> roleStrList = roleList.stream().map(item -> item.getId() + "_" + item.getName()).collect(Collectors.toList());
                userDTO.setRoles(ListUtil.toList("1", "2", "3", "test", "admin"));
//            }
            return userDTO;
        }
        return null;
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public CommonResult login(String username, String password) {
        if(StrUtil.isEmpty(username)||StrUtil.isEmpty(password)){
            Asserts.fail("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
        params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
        params.put("client_secret","123456");
        params.put("grant_type","password");
        params.put("username",username);
        params.put("password",password);
        CommonResult restResult = authService.getAccessToken(params);
        if(ResultCode.SUCCESS.getCode()==restResult.getCode()&&restResult.getData()!=null){
//            updateLoginTimeByUsername(username);
//            insertLoginLog(username);
        }
        return restResult;
    }
}
