package com.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
* <p>Title: SpringCloudConfigApplication</p>
* <p>Description: 
* 	注册为服务
	虽然通过服务端负载均衡已经能够实现，
	但是作为架构内的配置管理，
	本身其实也是可以看作架构中的一个微服务。
	所以，另外一种方式更为简单的方法就是把config-server也注册为服务，
	这样所有客户端就能以服务的方式进行访问。
	通过这种方法，只需要启动多个指向同一Git仓库位置的config-server就能实现高可用了。
	</p>
* <p>Company: 苏州朗动</p> 
* @author hxh
* @date 2017年8月2日 下午2:39:45
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient//在应用主类中，新增@EnableDiscoveryClient注解，用来将config-server注册到上面配置的服务注册中心上去。
public class SpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigApplication.class, args);
	}
}
