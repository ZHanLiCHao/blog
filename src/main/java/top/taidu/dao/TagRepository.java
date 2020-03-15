package top.taidu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.taidu.po.Tag;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
