package net.jandan.service;

import net.jandan.pojo.User;

import java.util.List;

/**
 * @author XKK
 * @create 2018-06-08 16:16
 * @desc
 **/

public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();

    boolean isExist(String name);

    User get(String name, String password);
}