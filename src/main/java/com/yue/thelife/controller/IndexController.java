package com.yue.thelife.controller;

import com.yue.thelife.exception.AppException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 *
 * @Auther: 于不凡
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = {"/", ""})
    public ResponseEntity<Object> query(String x, String y) {
//        if (true) throw new AppException("连接微信小程序后台异常");
        return new ResponseEntity<>("连接微信小程序后台成功" + x + y, HttpStatus.OK);
    }

}
