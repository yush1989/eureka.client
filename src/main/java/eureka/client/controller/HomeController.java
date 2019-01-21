package eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

	@Value("${server.port}")
	String port;
	
	@RequestMapping(value="/port")
	public String getPort() {
		return port;
	}

}
