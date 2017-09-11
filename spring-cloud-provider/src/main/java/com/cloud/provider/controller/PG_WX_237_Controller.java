package com.cloud.provider.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.provider.controller.service.PG_WX_237_ControllerService;
import com.cloud.provider.service.PG_WX_237_Service;

/**
* <p>Title: PG_WX_237_Controller</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午9:03:22
*/
@RestController
public class PG_WX_237_Controller implements PG_WX_237_ControllerService{

	@Autowired
	private PG_WX_237_Service pG_WX_237_Service;
	
	@Override
	public List<Map<String, Object>> queryForList(String sql, Object params[]) {
		return pG_WX_237_Service.queryForList(sql, params);
	}

}
