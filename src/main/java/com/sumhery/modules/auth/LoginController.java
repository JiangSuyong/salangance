package com.sumhery.modules.auth;

import com.sumhery.modules.auth.entity.BaseEntity;
import com.sumhery.modules.auth.entity.User;
import com.sumhery.modules.auth.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsy on 2017/4/28.
 */

@RestController
public class LoginController {


    @RequestMapping(value = "/login",method = RequestMethod.POST,consumes="application/json" )

    public BaseEntity<UserInfo> login(@RequestBody User user)
    {
        BaseEntity<UserInfo> baseEntity;
        if(user.getName().equals("haiyan")) {
            UserInfo info = new UserInfo();
            info.setName(user.getName() + "  123456");
            baseEntity = new BaseEntity<>(0, " ", info);
        }else {
            baseEntity = new BaseEntity<>(200, "用户名不对", null);
        }

        return baseEntity;
    }

    @RequestMapping(value = "/get" ,method = RequestMethod.GET)
    public BaseEntity<UserInfo> get()
    {
        UserInfo info= new UserInfo();
        info.setName("jiangsuyong");
        BaseEntity<UserInfo> infoBaseEntity =new BaseEntity<>(0,"",info);
        return infoBaseEntity;
    }

}
