package ua.nure.controller.insts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StyController {

    @RequestMapping(value = "/insts/sty", method = RequestMethod.GET)
    public String sty() {
        return "insts/sty";
    }
}
