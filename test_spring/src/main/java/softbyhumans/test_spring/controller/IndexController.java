package softbyhumans.test_spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/i")
    public String index(){
        return "index";
    }

}
