package ys.springcloud.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.base.ResponseBase;

public interface IMemberService {
    @RequestMapping("/getMember")
    UserEntity getMember(@RequestParam("name") String name);
    @RequestMapping("/getUserInfo")
    ResponseBase getUserInfo();
}
