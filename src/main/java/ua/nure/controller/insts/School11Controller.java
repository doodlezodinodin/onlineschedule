package ua.nure.controller.insts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class School11Controller {

    @RequestMapping(value = "/insts/school11", method = RequestMethod.GET)
    public String school11() {
        return "insts/school11";
    }
}
