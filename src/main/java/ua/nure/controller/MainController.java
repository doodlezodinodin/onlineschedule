package ua.nure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.nure.dao.InstitutionDao;
import ua.nure.entity.Institution;

@Controller
public class MainController {

    private final InstitutionDao institutionDao;

    @Autowired
    public MainController(InstitutionDao institutionDao) {
        this.institutionDao = institutionDao;
    }

    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
    public String main(Model model) {
        Iterable<Institution> listInstitution = institutionDao.findAll();
        model.addAttribute("listInstitution", listInstitution);
        return "main";
    }

    @RequestMapping(value = "/searchPage", method = RequestMethod.POST)
    public String searchPage(@RequestParam(value = "namePage") String s) {
        return "redirect:/insts/" + s;
    }
}
