package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author 冯东林
 * @Create 2019-03-08 20:05
 */

@Getter
@NoArgsConstructor   //无参构造
@AllArgsConstructor  //有参构造
public enum ExceptionEnum {


    PRICE_CANNOT_BE_NULL(400,"价格不能为空")
    ;

    private int code;   //状态码
    private String msg; //提示信息

}
