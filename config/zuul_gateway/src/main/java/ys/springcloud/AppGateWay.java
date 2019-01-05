package ys.springcloud;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
public class AppGateWay {
    public static void main(String[] args) {
        SpringApplication.run(AppGateWay.class,args);
    }

    //zuul配置自动实时更新
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider{
        @Override
        public List<SwaggerResource> get() {
            List<SwaggerResource> resource = new ArrayList<>();
            resource.add(swaggerResource("app-member","/api-member/v2/api-docs","2.0"));
            resource.add(swaggerResource("app-order","/api-order/v2/api-docs","2.0"));
            return resource;
        }

        private SwaggerResource swaggerResource(String name,String location,String version){
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
