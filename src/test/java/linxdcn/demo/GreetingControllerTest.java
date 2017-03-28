package linxdcn.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;
import linxdcn.demo.Greeting;
import linxdcn.demo.GreetingController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class GreetingControllerTest {
	@Resource
	private GreetingController greetingController;
	
	 @Test
     public void testGetName(){
		 TestCase.assertEquals("Hello, lin!",greetingController.greeting("lin").getContent());
     }
}
