package top.taidu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import top.taidu.po.Blog;

public interface BlogRepository extends JpaRepository<Blog,Long>, JpaSpecificationExecutor<Blog> {
}
