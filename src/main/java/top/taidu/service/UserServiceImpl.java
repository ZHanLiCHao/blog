package top.taidu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.taidu.dao.UserRepository;
import top.taidu.po.User;
import top.taidu.util.MD5Utils;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String userName, String password) {

        User user = userRepository.findByUserNameAndPassword(userName, MD5Utils.code(password));
        return user;
    }
}
