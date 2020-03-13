package top.taidu.blog.web;

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
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("---------index-----------");
        System.out.println("---------id = {}-----------" + id);
        System.out.println("---------name = {}-----------" + name);
        return "index";
    }
}
