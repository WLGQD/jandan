package net.jandan.service.Impl;


import net.jandan.mapper.CommentMapper;
import net.jandan.mapper.UserMapper;
import net.jandan.pojo.Comment;
import net.jandan.pojo.CommentExample;
import net.jandan.pojo.User;
import net.jandan.pojo.UserExample;
import net.jandan.service.CommentService;
import net.jandan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XKK
 * @create 2018-05-10 10:38
 * @desc
 **/
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public void add(Comment c) {
        commentMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Comment u) {
        commentMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public Comment get(int id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list() {
        CommentExample example =new CommentExample();
        example.setOrderByClause("id desc");
        return commentMapper.selectByExample(example);
    }


}