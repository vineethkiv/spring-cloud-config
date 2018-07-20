package kiv.ms.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

	@Value("${kiv.test.prop}")
	private String testProperty;
	
	public String getProperty() {
		return "Using [" + testProperty + "] from config server";
	}
	
}
