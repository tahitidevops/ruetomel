package pf.devops.ruetomel.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  /**
   * Redirect the base URL to /index.
   *
   * @return a String to tell SpringMVC to redirect the user's browser to '/index'
   */
  @GetMapping("/")
  public String redirectToIndex() {
    return "index/index";
  }

  /**
   * Index page for the public section.
   *
   * @return a ModelAndView that will be used by Thymeleaf to generate the HTML content
   */
  @GetMapping("/index")
  public String index() {
    return "index/index";
  }

  /**
   * Logout endpoint.
   *
   * @return a String to tell SpringMVC to redirect the user's browser to '/index'
   */

  @GetMapping("/logout")
  public String logout(HttpServletRequest request, HttpServletResponse response) {

    //        SecurityContextHolder.clearContext();
    //        HttpServletRequest.logout();

    String handlerName = AbstractRememberMeServices.SPRING_SECURITY_REMEMBER_ME_COOKIE_KEY;
    CookieClearingLogoutHandler handler = new CookieClearingLogoutHandler(handlerName);
    SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();

    handler.logout(request, response, null);
    securityContextLogoutHandler.logout(request, response, null);

    return "redirect:/index";
  }
}
