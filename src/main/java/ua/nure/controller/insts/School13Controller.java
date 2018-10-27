package ua.nure.controller.insts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class School13Controller {

    @RequestMapping(value = "/insts/school13", method = RequestMethod.GET)
    public String school13() {
        return "insts/school13";
    }
}
