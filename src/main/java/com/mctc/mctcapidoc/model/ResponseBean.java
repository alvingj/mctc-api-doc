package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:统一响应对象
 *
 * @param:
 * @return:
 * @author: gongjun
 * @date: 2018/12/14 13:50
 */
public class ResponseBean<T> {
    @ApiModelProperty(value = "状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限", name = "status", dataType = "Long")
    private int status;

    @ApiModelProperty(value = "信息", name = "message", dataType = "String")
    private String message;

    @ApiModelProperty(value = "数据", name = "data", dataType = "Object")
    private T data;

    public ResponseBean() {
        status = 0;
    }


    public ResponseBean(int status, String message, T data) {
        this.status = status;
        this.data = data;
        this.message = message;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
