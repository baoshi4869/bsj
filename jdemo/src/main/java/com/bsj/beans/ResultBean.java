package com.bsj.beans;

import java.io.File;
import java.io.Serializable;

public class ResultBean<T>implements Serializable {

    private static final  Long serialVersionUID =1L;

    //成功时的状态码，避免魔法赋值
    public static final  int SUCCESS = 0;

    public static final  int FAIL = 1;

    private String msg = "success";
    //如果code的状态码是失败，则去获取失败的信息 msg
    private int code = SUCCESS;
    // 用来存放数据的变量
    private T data;


    public ResultBean(){
        super();
    }


    public ResultBean(T data){
        super();
        this.data = data;
    }

    //如果出现异常，msg存放异常信息，并且相应的修改状态
    public ResultBean(Throwable e){
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
