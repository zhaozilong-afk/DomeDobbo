package com.zsj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zsj.service.IUserService;

@Service
public class UserSerivceImpl implements IUserService {
    @Override
    public String showName() {
        return "FARTHER";
    }
}
