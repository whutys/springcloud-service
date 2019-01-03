package ys.springcloud.api.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.api.service.IMemberService;
import ys.springcloud.base.BaseApiService;
import ys.springcloud.base.ResponseBase;

@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge("20");
        return userEntity;
    }

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        return setResultSuccess("订单调会员成功");
    }
}
