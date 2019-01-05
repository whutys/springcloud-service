package ys.springcloud.api.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.api.feign.MemberServiceFeign;
import ys.springcloud.api.service.IOrderService;
import ys.springcloud.base.BaseApiService;
import ys.springcloud.base.ResponseBase;

@RestController
public class OrderServiceImpl extends BaseApiService implements IOrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/orderToMember")
    public String orderToMember(String name) {
        UserEntity user = memberServiceFeign.getMember(name);
        return user == null ? "" : user.toString();
    }

    @RequestMapping("/orderToMemberUserInfo")
    public ResponseBase orderToMemberUserInfo() {
        return memberServiceFeign.getUserInfo();
    }

    //解决服务器雪崩

    /**
     * 默认隔离 线程池
     * 默认降级执行
     * 默认熔断
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "orderToMemberUserInfoHystrixFallback")
    @RequestMapping("/orderToMemberUserInfoHystrix")
    public ResponseBase orderToMemberUserInfoHystrix() {
        return memberServiceFeign.getUserInfo();
    }

    public ResponseBase orderToMemberUserInfoHystrixFallback() {
        return setResultSuccess("服务器忙");
    }

    //Hystrix2
    @RequestMapping("/orderToMemberUserInfoHystrix2")
    public ResponseBase orderToMemberUserInfoHystrix2() {
        return memberServiceFeign.getUserInfo();
    }
}
