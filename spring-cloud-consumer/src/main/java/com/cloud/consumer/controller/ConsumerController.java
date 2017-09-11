package com.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cloud.consumer.service.ComputeClient;

/**
* <p>Title: ConsumerController</p>
* <p>Description: 创建ConsumerController来消费compute-service的add服务。通过直接RestTemplate来调用服务，计算10 + 20的值。</p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月1日 下午8:57:20
*/
@RestController
public class ConsumerController {
	
	@Autowired
    ComputeClient computeClient;
	
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }
    
}