package com.hykj.ccbrother.base;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class APIException extends Exception {

    private int status;
    private String msg;
    public  APIException (int status, String msg){
        this.status=status;
        this.msg=msg;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
