package eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@RefreshScope
public class EurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	@Value("${server.port}")
	String port;
	
	@Value("${hellotest}")
	String test;
	
	@RequestMapping("/")
	public String home() {
		return "visit by port:"+port;
	}
	
	@RequestMapping("/name/{name}")
	public String getName(@PathVariable("name") String name) {
		return "name is "+name;
	}
	
	@RequestMapping(value="/hello")
	public String getHello() {
		return test;
	}
}
