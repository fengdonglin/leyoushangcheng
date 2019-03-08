/**
 * Author:   冯东林
 * Date:     2019/3/8 20:36
 */
package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

//异常结果对象
@Data
public class ExceptionResult {

    private int status;       //状态
    private String message;   //信息
    private Long timestamp;   //时间戳


    public ExceptionResult(ExceptionEnum em) {
          this.status=em.getCode();
          this.message= em.getMsg();
          this.timestamp=System.currentTimeMillis();
    }
}