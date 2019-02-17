/**
 *
 */
package com.StreamRabbitMQSelf.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StreamRabbitMQSelf.rabbitMQ.service.SendMessage;
import com.StreamRabbitMQSelf.utils.common.ParameterUtil;



/**
 * @author mazhen
 *
 */
@RestController
public class TestController {

    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private SendMessage  sendMessage;

    @RequestMapping(value = "recevieCdkeyFrom",method = RequestMethod.POST)
    public String recevieCdkeyFrom(HttpServletRequest request){

        String jsonStr = null;
        try {
            jsonStr = ParameterUtil.getParametersStr(request);
            logger.info("----:"+jsonStr);
            sendMessage.sendMsgStr(jsonStr);
        } catch (IOException e) {
            logger.error("异常信息："+e);
            e.printStackTrace();
            return "IOException:"+e;
        }
        return jsonStr;
    }

}

