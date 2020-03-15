package top.taidu.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.taidu.po.Blog;
import top.taidu.vo.BlogQuery;

import java.util.List;

public interface BlogService {
    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    List<Blog> listBlogTop(Integer size);
    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
