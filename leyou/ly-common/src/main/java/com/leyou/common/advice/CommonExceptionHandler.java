/**
 * Author:   冯东林
 * Date:     2019/3/8 19:48
 */
package com.leyou.common.advice;
/*
*   通知： 通用异常处理     拦截controller层所有异常
*
* */

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LyException.class)  //拦截指定异常
    public ResponseEntity<ExceptionResult> handleException(LyException e){  //将异常传进方法里
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));  //异常的状态码和提示信息
    }



}