package com.yue.thelife.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Rest全局异常处理
 *
 * @Auther: 于不凡
 */
@ControllerAdvice
public class RestExceptionAdvice {

    @ExceptionHandler({AppException.class})
    @ResponseBody
    public ResponseEntity<Object> handleIndexOutOfBoundsException(Exception e) {
        return new ResponseEntity<>("内部服务器发生异常:[" + e.getMessage() + "]，请联系管理员", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
