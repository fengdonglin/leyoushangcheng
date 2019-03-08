/**
 * Author:   冯东林
 * Date:     2019/3/8 19:08
 */
package com.leyou.service;

import org.springframework.stereotype.Service;
import pojo.Item;

import java.util.Random;

@Service
public class ItemService {

    //新增方法
    public Item savaItem(Item item){
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }

}