package com.cloud.consumer.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import com.cloud.consumer.service.ComputeClient;

/**
* <p>Title: ComputeClientHystrix</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月2日 上午9:29:10
*/
@Component
public class ComputeClientHystrix implements ComputeClient {

	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return -9999;
	}

}
