package top.taidu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.taidu.po.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndPassword(String username, String password);
}
