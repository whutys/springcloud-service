package ys.springcloud.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.api.feign.MemberServiceFeign;
import ys.springcloud.api.service.IOrderService;
import ys.springcloud.base.ResponseBase;

@RestController
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/orderToMember")
    public String orderToMember(String name) {
        UserEntity user = memberServiceFeign.getMember(name);
        return user==null?"":user.toString();
    }

    @RequestMapping("/orderToMemberUserInfo")
    public ResponseBase orderToMemberUserInfo() {
        return memberServiceFeign.getUserInfo();
    }
}
