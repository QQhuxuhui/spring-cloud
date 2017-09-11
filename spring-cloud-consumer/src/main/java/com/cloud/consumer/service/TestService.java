package com.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.cloud.consumer.service.impl.TestServiceImpl;
import com.cloud.provider.controller.service.TestControllerService;

/**
* <p>Title: TestService</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月3日 上午11:43:26
*/
@FeignClient(value = "application", fallback = TestServiceImpl.class)
public interface TestService extends TestControllerService{

}
