package ys.springcloud.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import ys.springcloud.base.ResponseBase;

public interface IOrderService {

    @RequestMapping("/orderToMember")
    String orderToMember(String name);
    @RequestMapping("/orderToMemberUserInfo")
    ResponseBase orderToMemberUserInfo();
}
