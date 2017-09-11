package com.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.cloud.provider.config.datasource.druid.DynamicDataSource.DynamicDataSourceRegister;
import com.cloud.provider.config.datasource.druid.DynamicDataSource.MProxyTransactionManagementConfiguration;

/**
 * 
* <p>Title: SpringCloudProviderApplication</p>
* <p>Description: 类中通过加上@EnableDiscoveryClient注解，该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出。</p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月1日 下午8:44:55
 */
@EnableDiscoveryClient
@SpringBootApplication
@Import({DynamicDataSourceRegister.class, MProxyTransactionManagementConfiguration.class})
public class SpringCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderApplication.class, args);
	}
}
