package com.michloas.springboot.controller;

import com.michloas.springboot.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by michloas on 2018/8/8.
 */
@RestController
public class TestController {

    @RequestMapping("/getTime")
    public Long getUser() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        calendar.add(Calendar.SECOND,-1);
        return calendar.getTimeInMillis();
    }

    @RequestMapping("/getTime1")
    public Date getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        /*calendar.add(Calendar.SECOND,-1);*/
        calendar.add(Calendar.HOUR,-1);
        return calendar.getTime();
    }

}
