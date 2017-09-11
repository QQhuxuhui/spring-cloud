package com.cloud.provider.controller.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
* <p>Title: TestControllerService</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月3日 上午11:03:29
*/
public interface TestControllerService {

    @RequestMapping("/from")
    public String from();
    
}
