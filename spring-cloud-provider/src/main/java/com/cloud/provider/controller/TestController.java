package com.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.provider.controller.service.TestControllerService;

/**
* <p>Title: TestController</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月2日 下午1:59:50
*/
@RefreshScope
@RestController
public class TestController implements TestControllerService{
	
    @Value("${from}")
    private String from;
    
    @Override
    public String from() {
        return this.from;
    }
}
