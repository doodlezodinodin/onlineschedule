package ua.nure.controller.insts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class School18Controller {

    @RequestMapping(value = "/insts/school18", method = RequestMethod.GET)
    public String school18() {
        return "insts/school18";
    }
}
