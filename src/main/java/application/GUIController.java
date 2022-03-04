package application;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GUIController {
    private BuddyInfoRepository repository;

    GUIController(BuddyInfoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/index")
    public String gui(Model model){
        model.addAttribute("buddies", repository.findAll());
        return "index";
    }
}
