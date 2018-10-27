package ua.nure.controller.insts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShmtController {

    @RequestMapping(value = "/insts/shmt", method = RequestMethod.GET)
    public String shmt() {
        return "insts/shmt";
    }
}
