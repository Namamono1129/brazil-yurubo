package teambrazil.yurubo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import teambrazil.yurubo.entity.Brazil;
import teambrazil.yurubo.entity.Brazilian;
import teambrazil.yurubo.entity.LoginUser;
import teambrazil.yurubo.exception.BrazilNotFoundException;
import teambrazil.yurubo.service.BrazilService;
import teambrazil.yurubo.service.MembershipService;

import java.security.Principal;

@Controller
public class BrazilController {

    @Autowired
    BrazilService brazilService;

    @Autowired
    MembershipService membershipService;

    /**
     * Browse a brazil by a URL "host/brazil/{brazilId}".
     * If a Brazil with specified id does not exist, returns not found page.
     * If a Brazil is found, checks membership for logging-in user.
     * @param model
     * @param brazilStringId
     * @param principal
     * @return
     */
    @RequestMapping("brazil/{brazilId}")
    public String brazil(Model model, @PathVariable("brazilId") String brazilStringId, Principal principal) {
        Brazil brazil;
        try {
            brazil = brazilService.findBrazilByStringId(brazilStringId);
        } catch(BrazilNotFoundException e) {
            model.addAttribute("brazil_name", brazilStringId);
            return "brazil_notfound";
        }

        Authentication auth = (Authentication)principal;
        LoginUser loginUser = (LoginUser)auth.getPrincipal();
        Brazilian brazilian = loginUser.getWrappedBrazilian();
        model.addAttribute("username", brazilian.getName());

        if (!membershipService.isMember(brazilian.getId(), brazil.getId())) {
            model.addAttribute("brazil", brazil);
            return "no_membership";
        }

        return "brazil_home";
    }
}
