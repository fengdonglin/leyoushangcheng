/**
 * Author:   冯东林
 * Date:     2019/3/8 19:04
 */
package pojo;

import lombok.Data;

@Data  //该注解提供 get set方法
public class Item {

    private Integer id;
    private String name;
    private Long price;

}