package com.sumhery.modules.auth.entity;

/**
 * Created by jsy on 2017/4/28.
 */
public class BaseEntity<T> {
    int code;
    String msg;
    T data;

    public BaseEntity(int code,String msg,T data)
    {
        this.code =code;
        this.msg =msg;
        this.data =data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
