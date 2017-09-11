package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
* <p>Title: SpringCloudConsumerApplication</p>
* <p>Description: 在应用主类中，通过@EnableDiscoveryClient注解来添加发现服务能力。创建RestTemplate实例，并通过@LoadBalanced注解开启均衡负载能力。
* 					在应用主类中通过@EnableFeignClients注解开启Feign功能</p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月1日 下午8:56:26
 */
@SpringCloudApplication
@EnableFeignClients
public class SpringCloudConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}
	
}
