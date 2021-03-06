package com.gossip.xiaofeiji;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String say() {
        return cupSize+age;
    }
}
