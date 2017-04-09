package org.springframework.samples.mvc.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}

}
