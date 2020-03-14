package top.taidu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.taidu.po.Type;

public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);
}
