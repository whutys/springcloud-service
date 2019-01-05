package ys.springcloud.api.fallback;

import org.springframework.stereotype.Component;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.api.feign.MemberServiceFeign;
import ys.springcloud.base.BaseApiService;
import ys.springcloud.base.ResponseBase;

@Component
public class MemberServiceFallback extends BaseApiService implements MemberServiceFeign {
    @Override
    public UserEntity getMember(String name) {
        return null;
    }

    @Override
    public ResponseBase getUserInfo() {
        return setResultSuccess("服务器忙");
    }
}
