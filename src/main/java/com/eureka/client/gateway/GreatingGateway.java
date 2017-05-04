package com.eureka.client.gateway;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-client")
public interface GreatingGateway {

	@RequestMapping("/greatings")
	String greating();
}
