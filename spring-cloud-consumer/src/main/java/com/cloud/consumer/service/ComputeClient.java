package com.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.consumer.service.impl.ComputeClientHystrix;

/**
* <p>Title: ComputeClient</p>
* <p>Description: 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
					通过Spring MVC的注解来配置compute-service服务下的具体实现。
					创建回调类ComputeClientHystrix，实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数。
					</p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月1日 下午9:08:44
*/
@FeignClient(value = "application", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
    
}
