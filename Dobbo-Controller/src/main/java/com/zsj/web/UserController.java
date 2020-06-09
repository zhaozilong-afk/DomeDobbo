package com.zsj.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zsj.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private IUserService iUserSerivce;

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return iUserSerivce.showName();
    }

}
