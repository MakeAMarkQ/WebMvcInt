package fi.canagot.Main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontPage {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String frontPageGET(Model model){
        model.addAttribute("method","method GET");
        model.addAttribute("test","Tämä tulee Modelista");
        return "front-page";
    }
    @RequestMapping(value="/",method = RequestMethod.POST)
    public String frontPagePOST(@RequestParam("request") String str,Model model){
        model.addAttribute("method","method POST: "+str);
        model.addAttribute("test","Tämä tulee Modelista");
        return "front-page";
    }
    @RequestMapping(value="/second")
    public String secondPageGET(Model model){
        model.addAttribute("toki","Tämä tulee omina");
        return "second-page";
    }
}
