package pf.devops.ruetomel.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class AdminController
{
    @GetMapping("/admin")
    public ModelAndView admin()
    {
        ModelAndView mav = new ModelAndView("index/index");

//        mav.

        return mav;
    }
}
