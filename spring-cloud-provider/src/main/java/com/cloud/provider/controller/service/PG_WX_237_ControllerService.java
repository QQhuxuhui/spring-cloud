package com.cloud.provider.controller.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* <p>Title: PG_WX_237_ControllerService</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午9:03:47
*/
public interface PG_WX_237_ControllerService {

    @RequestMapping("/queryForList")
    public List<Map<String, Object>> queryForList(@RequestParam("sql") String sql, @RequestParam(value = "params[]") Object params[]);
    
}
