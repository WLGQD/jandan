package net.jandan.service;

import net.jandan.pojo.Comment;
import net.jandan.pojo.CommentXO;

import java.util.List;

/**
 * @author XKK
 * @create 2018-06-08 16:18
 * @desc
 **/

public interface CommentXOService {
    void add(CommentXO c);

    boolean isExist(int cid,String ip);


}