package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/freeMarkController")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
