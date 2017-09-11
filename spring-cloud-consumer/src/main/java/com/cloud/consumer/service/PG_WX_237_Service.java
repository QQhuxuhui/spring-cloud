package com.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.cloud.consumer.service.impl.PG_WX_237_ServiceImpl;
import com.cloud.provider.controller.service.PG_WX_237_ControllerService;

/**
* <p>Title: PG_WX_237_Service</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午9:31:00
*/
@FeignClient(value = "application", fallback = PG_WX_237_ServiceImpl.class)
public interface PG_WX_237_Service extends PG_WX_237_ControllerService{
	
}
