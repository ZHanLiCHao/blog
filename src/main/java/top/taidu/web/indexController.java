package top.taidu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * describe:
 *
 * @author ZHan
 * @date 2020/03/13
 */
@Controller
public class indexController {
    @GetMapping("/index")
    public String index() {
        return "admin/index";
    }
}
