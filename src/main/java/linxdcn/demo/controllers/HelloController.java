package linxdcn.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/demo/hello")
	public String index() {
		return "Hello, welcome";
	}
	
	@RequestMapping("/demo/hello2")
	public String index2() {
		return "demo/hello/hello.html";
	}
}
