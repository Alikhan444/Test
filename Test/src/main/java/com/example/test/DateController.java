package com.example.test;

import com.example.test.model.DateTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController("/date")
public class DateController {

    @GetMapping("/getDate")
    public DateTest getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date();
        DateTest dateTest = new DateTest(simpleDateFormat.format(date), simpleDateFormat2.format(date));
        return dateTest;
    }
}
