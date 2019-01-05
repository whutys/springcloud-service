package ys.springcloud.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Swagger控制器")
@RestController
public class SwaggerController {
    @ApiOperation("swagger演示接口")
    @GetMapping("/swaggerIndex")
    public String swaggerIndex(){
        return "";
    }

    @ApiOperation("会员相关信息")
    @ApiImplicitParam(name = "userName",value = "用户信息参数",required = true,dataType = "String")
    @PostMapping("/getMember")
    public String getMember(String userName){
        return "userName:"+userName;
    }
}
