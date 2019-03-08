/**
 * Author:   冯东林
 * Date:     2019/3/8 19:12
 */
package com.leyou.controller;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.service.ItemService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Item;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item) {
        if (item.getPrice() == null) {
            //抛异常
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);  //传了两个参数
        }

        item = itemService.savaItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

}