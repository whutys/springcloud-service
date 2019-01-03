package ys.springcloud.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ys.springcloud.api.service.IMemberService;

@FeignClient("app-member")
public interface MemberServiceFeign extends IMemberService {

}
