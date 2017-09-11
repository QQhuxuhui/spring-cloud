package com.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.consumer.service.TestService;

/**
* <p>Title: TestController</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月3日 上午11:44:52
*/
@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
	public String test(){
		return testService.from();
	}
}
