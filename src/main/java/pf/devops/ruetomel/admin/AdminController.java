package pf.devops.ruetomel.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

  /**
   * Index page for the admin section.
   *
   * @return a ModelAndView that will be used by Thymeleaf to generate the HTML content
   */
  @GetMapping("/admin")
  public ModelAndView admin() {
    ModelAndView mav = new ModelAndView("admin/index");

    //        mav.

    return mav;
  }
}
