package jmauriciorlima.github.portfolio.controller;

import jmauriciorlima.github.portfolio.model.ContactModel;
import jmauriciorlima.github.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("nome", "José Maurício");
        return "home/index";
    }

    @PostMapping(value = "/contato")
    public String saveMessage(ContactModel contactModel){
        contactService.sendMessage(contactModel);
        return "redirect:/";
    }

}
