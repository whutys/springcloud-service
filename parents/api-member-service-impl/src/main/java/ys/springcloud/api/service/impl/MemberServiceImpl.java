package ys.springcloud.api.service.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.api.entity.UserEntity;
import ys.springcloud.api.service.IMemberService;
import ys.springcloud.base.BaseApiService;
import ys.springcloud.base.ResponseBase;

@RestController
@Api("会员服务接口")
public class MemberServiceImpl extends BaseApiService implements IMemberService {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/")
    public String test(){
        return appName+":"+serverPort;
    }

    @ApiOperation("会员相关信息")
    @ApiImplicitParam(name = "name",value = "用户信息参数",required = true,dataType = "String")
    @PostMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge("20");
        return userEntity;
    }

    @GetMapping("/getUserInfo")
    public ResponseBase getUserInfo() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        return setResultSuccess("订单调会员成功");
    }
}
