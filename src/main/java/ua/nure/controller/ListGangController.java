package ua.nure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.nure.dao.GangDao;
import ua.nure.entity.Gang;

@Controller
public class ListGangController {

    private final GangDao gangDao;

    @Autowired
    public ListGangController(GangDao gangDao) {
        this.gangDao = gangDao;
    }

    @RequestMapping(name = "/listGang", method = RequestMethod.GET)
    public String gangList(Model model) {
        Iterable<Gang> listGang = gangDao.findAll();
        model.addAttribute("listGang", listGang);
        return "listGang";
    }
}
