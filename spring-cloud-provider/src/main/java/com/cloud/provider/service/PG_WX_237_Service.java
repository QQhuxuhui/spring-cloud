package com.cloud.provider.service;

import java.util.List;
import java.util.Map;

/**
* <p>Title: PG_237_Service</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午8:48:48
*/
public interface PG_WX_237_Service {

	public List<Map<String,Object>> queryForList(String sql, Object params[]);
	
}
