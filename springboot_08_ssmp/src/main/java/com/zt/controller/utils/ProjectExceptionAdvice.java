package com.zt.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.controller.utils
 * @Author: zt
 * @CreateTime: 2023-02-24  17:09
 * @Description:
 */

//作为springmvc的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        //记录日志
        //通知运维
        //通知开发
        //记得打印异常的信息，不然异常的信息会不显示
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }

}
