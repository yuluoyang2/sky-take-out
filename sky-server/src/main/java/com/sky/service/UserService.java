package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;

public interface UserService {
    User wxLogin(UserLoginDTO userLoginDTO);
}
