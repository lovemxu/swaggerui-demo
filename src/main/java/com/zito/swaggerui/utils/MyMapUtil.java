package com.zito.swaggerui.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description map封装结果util
 * @Author 许慜
 * @Date: 2017-05-09 13:52
 */
public class MyMapUtil {

    /**
     * @param message
     * @param status
     * @param data
     * @return
     * @Description 封装结果
     */
    public static Map<String, Object> putResult(String status, String message, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("status", status);
        map.put("data", data);
        return map;
    }
}
