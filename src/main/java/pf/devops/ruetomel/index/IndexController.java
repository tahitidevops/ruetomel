package pf.devops.ruetomel.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    @GetMapping("/")
    public String redirectToIndex()
    {
        return "index/index";
    }

    @GetMapping("/index")
    public String index()
    {
        return "index/index";
    }
}
