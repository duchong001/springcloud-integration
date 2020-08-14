package com.duchong.springcloud.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @author DUCHONG
 * @since 2019-05-07 9:58
 **/
public class JsonResult {

    public static JSONObject success() {
        JSONObject success = new JSONObject();
        success.put("code", 0);
        success.put("msg", "");
        success.put("data", "");
        return success;
    }

    public static JSONObject success(String msg) {
        JSONObject success = new JSONObject();
        success.put("code", 0);
        success.put("msg", msg);
        success.put("data", "");
        return success;
    }

    public static JSONObject success(Object data) {
        JSONObject success = new JSONObject();
        success.put("code", 0);
        success.put("msg", "");
        success.put("data", data);
        return success;
    }

    public static JSONObject success(String msg, Object data) {
        JSONObject success = new JSONObject();
        success.put("code", 0);
        success.put("msg", msg);
        success.put("data", data);
        return success;
    }


    public static JSONObject error() {
        JSONObject error = new JSONObject();
        error.put("code", 1);
        error.put("msg", "");
        error.put("data", "");
        return error;
    }

    public static JSONObject error(String msg) {
        JSONObject error = new JSONObject();
        error.put("code", 1);
        error.put("msg", msg);
        error.put("data", "");
        return error;
    }

    public static JSONObject error(Object data) {
        JSONObject error = new JSONObject();
        error.put("code", 1);
        error.put("msg", "");
        error.put("data", data);
        return error;
    }

    public static JSONObject error(String msg, Object data) {
        JSONObject error = new JSONObject();
        error.put("code", 1);
        error.put("msg", msg);
        error.put("data", data);
        return error;
    }
}
