/**
 *
 */
package com.StreamRabbitMQSelf.utils.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


/**
 * @author mazhen
 * 获取post请求中的body内容
 */
public class ParameterUtil {

    public static String getParametersStr(HttpServletRequest request) throws IOException {
        //从request中以"UTF-8"形式获取输入流，避免中文乱码
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
        StringBuffer sb = new StringBuffer("");
        String temp;
        //一行一行读取并放入到StringBuffer中
        while((temp = br.readLine()) != null){
            sb.append(temp);
        }
        br.close();
        String acceptjson = sb.toString();
        return acceptjson;
    }

}

