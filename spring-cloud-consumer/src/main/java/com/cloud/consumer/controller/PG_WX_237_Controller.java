package com.cloud.consumer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cloud.consumer.service.PG_WX_237_Service;


/**
* <p>Title: TestController</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月3日 上午11:44:52
*/
@RestController
@RequestMapping("/PG_WX_237")
public class PG_WX_237_Controller {

	@Autowired
	private PG_WX_237_Service PG_WX_237_Service;
	
	@RequestMapping("/queryForList")
	public List<Map<String,Object>> queryForList(){
		return PG_WX_237_Service.queryForList("select * from t_job_progress where sn=?", null);
	}
}
