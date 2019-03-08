/**
 * Author:   冯东林
 * Date:     2019/3/8 20:15
 */
package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
*    自定义异常
*
* */


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException{

    //使用枚举   枚举中有状态码和提示消息
    private ExceptionEnum exceptionEnum;   //枚举

}