package teambrazil.yurubo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembershipController {

    @RequestMapping("/membership")
    public String membership() {
        return "membership";
    }
}
