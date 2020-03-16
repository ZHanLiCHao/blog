package top.taidu.service;

import top.taidu.po.User;

public interface UserService {
    User checkUser(String userName,String password);
}
