package ys.springcloud.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//刷新信息
public class ConfigClientController {
    @Value("${appname}")
    private String appName;
    @RequestMapping("/getAppName")
    public String getAppName(){
        return appName;
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
