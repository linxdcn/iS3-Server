package linxdcn.controllers;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;


/**
 * Created by linxiaodong on 4/9/17.
 */
@Controller
@ApiIgnore
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
