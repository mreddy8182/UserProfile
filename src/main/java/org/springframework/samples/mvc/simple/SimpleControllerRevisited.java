package org.springframework.samples.mvc.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
public class SimpleControllerRevisited {

	@RequestMapping(value="/simple/revisited", method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String simple() {
		return "Hello world revisited!";
	}

}
