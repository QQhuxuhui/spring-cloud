package com.cloud.provider.config.datasource.druid.DynamicDataSource;

import java.lang.annotation.*;

/**
 * 
* <p>Title: TargetDataSource</p>
* <p>Description: </p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月8日 下午4:56:37
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}