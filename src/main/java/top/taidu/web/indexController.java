package top.taidu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.taidu.po.Blog;
import top.taidu.service.BlogService;
import top.taidu.service.TagService;
import top.taidu.service.TypeService;
import top.taidu.vo.BlogQuery;

/**
 * describe:
 *
 * @author ZHan
 * @date 2020/03/13
 */
@Controller
public class indexController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private TagService tagService;
    @GetMapping("/")
    public String index(@PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {
        model.addAttribute("page", blogService.listBlog(pageable));
        model.addAttribute("types", typeService.listTypeTop(6));
        model.addAttribute("tags", tagService.listTagTop(6));
        model.addAttribute("blogs", blogService.listBlogTop(6));
        return "index";
    }
}
