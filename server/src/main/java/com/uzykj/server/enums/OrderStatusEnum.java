package com.uzykj.server.enums;

import lombok.Getter;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 14:45
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
