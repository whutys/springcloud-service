package ys.springcloud.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 公共响应类
 *
 * @param <T>
 */
@Data
@Slf4j
public class ResponseBase<T> {

    private static final int CODE_SUCCESS = 200;

    private static final int CODE_FAIL = 500;

    private static final int CODE_ERROR = 500;

    private static final int CODE_NO_LOGIN = 300;

    private int code;

    private String msg;

    private T data;

    public ResponseBase() {
    }

    public ResponseBase(int code, String msg, T data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static <T> ResponseBase<T> success() {
        return new ResponseBase<T>(CODE_SUCCESS, "success", null);
    }

    public static <T> ResponseBase<T> success(String message) {
        return new ResponseBase<T>(CODE_SUCCESS, message, null);
    }

    public static <T> ResponseBase<T> success(T data) {
        return new ResponseBase<T>(CODE_SUCCESS, "success", data);
    }

    public static <T> ResponseBase<T> success(String message, T data) {
        return new ResponseBase<T>(CODE_SUCCESS, message, data);
    }

    public static <T> ResponseBase<T> error() {
        return new ResponseBase<T>(CODE_ERROR, "fail", null);
    }

    public static <T> ResponseBase<T> error(String message) {
        return new ResponseBase<T>(CODE_ERROR, message, null);
    }

    public static <T> ResponseBase<T> error(T data) {
        return new ResponseBase<T>(CODE_ERROR, "fail", data);
    }

    public static <T> ResponseBase<T> error(String message, T data) {
        return new ResponseBase<T>(CODE_ERROR, message, data);
    }

    public static <T> ResponseBase<T> badrequest() {
        return new ResponseBase<T>(CODE_FAIL, "no identifier arguments", null);
    }

    public static <T> ResponseBase<T> badrequest(String message) {
        return new ResponseBase<T>(CODE_FAIL, message, null);
    }

    public static <T> ResponseBase<T> badrequest(T data) {
        return new ResponseBase<T>(CODE_FAIL, "no identifier arguments", data);
    }

    public static <T> ResponseBase<T> badrequest(String message, T data) {
        return new ResponseBase<T>(CODE_FAIL, message, data);
    }

    public static <T> ResponseBase<T> noLogin(String message) {
        return new ResponseBase<T>(CODE_NO_LOGIN, message, null);
    }

}
