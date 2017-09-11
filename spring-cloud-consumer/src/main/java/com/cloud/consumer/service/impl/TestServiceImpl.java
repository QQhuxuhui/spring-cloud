package com.cloud.consumer.service.impl;

import org.springframework.stereotype.Component;

import com.cloud.consumer.service.TestService;

/**
* <p>Title: TestService</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月3日 上午11:43:06
*/
@Component
public class TestServiceImpl implements TestService{

	@Override
	public String from() {
		return "error";
	}

}
