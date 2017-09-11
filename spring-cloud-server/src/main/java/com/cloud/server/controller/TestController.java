package com.cloud.server.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* <p>Title: TestController</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月2日 下午1:59:50
*/
@RefreshScope
@RestController
class TestController {
	
	//@Value("${from}")
    private String from;
    
    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
