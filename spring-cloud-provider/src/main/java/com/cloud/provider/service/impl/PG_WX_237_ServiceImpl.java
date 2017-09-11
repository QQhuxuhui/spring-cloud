package com.cloud.provider.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cloud.provider.config.datasource.druid.DynamicDataSource.TargetDataSource;
import com.cloud.provider.service.PG_WX_237_Service;

/**
* <p>Title: PG_WX_237_ServiceImpl</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午8:49:27
*/
@Service
public class PG_WX_237_ServiceImpl implements PG_WX_237_Service {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    @TargetDataSource(name="ds2")
    @Override
    public List<Map<String,Object>> queryForList(String sql, Object params[]) {
        return jdbcTemplate.queryForList(sql, params);
    }
    
}
