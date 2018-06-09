package net.jandan.service;

import net.jandan.pojo.Comment;
import net.jandan.pojo.User;

import java.util.List;

/**
 * @author XKK
 * @create 2018-06-08 16:18
 * @desc
 **/

public interface CommentService {
    void add(Comment c);
    void delete(int id);
    void update(Comment c);
    Comment get(int id);
    List list();


}