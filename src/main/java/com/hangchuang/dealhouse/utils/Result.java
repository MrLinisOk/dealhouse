package com.hangchuang.dealhouse.utils;

public class Result {
    // 状态 统一规定 1成功 0失败
    private int status;

    // 返回值
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
