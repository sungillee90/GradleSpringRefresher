package refresher.hellospinggradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewYearController {
    @GetMapping("newYearProject")
    @ResponseBody
    public HelloController.Hello helloApi(@RequestParam("name") String name) {
        HelloController.Hello hello = new HelloController.Hello();
        hello.setName(name);
        return hello;
    }
}
