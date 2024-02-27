package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jing1560
 * @data 2024/2/27
 */
@Controller
//@RequestMapping("/tomcat")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/home")
    public String home(){
        logger.info("welcome to home");
        return "home";
    }

    @RequestMapping("/welcomePage")
    @ResponseBody
    public String welcomePage(){
        logger.info("welcome to homePage");
        return "home";
    }
}
