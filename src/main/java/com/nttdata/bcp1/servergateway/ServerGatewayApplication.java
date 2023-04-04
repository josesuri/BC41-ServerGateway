package com.nttdata.bcp1.servergateway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerGatewayApplication {
	@Bean
	public HttpClient httpClient() {
		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
	}
	/*@Bean
	public RouteLocator customRoute(RouteLocatorBuilder builder){
		return builder.routes()
				.route(p -> p
						.path("/customer")
						.uri("http://localhost:8081"))
				.build();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ServerGatewayApplication.class, args);
	}

}
