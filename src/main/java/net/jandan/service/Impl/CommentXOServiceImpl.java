package net.jandan.service.Impl;


import net.jandan.mapper.CommentMapper;
import net.jandan.mapper.CommentXOMapper;
import net.jandan.pojo.Comment;
import net.jandan.pojo.CommentExample;
import net.jandan.pojo.CommentXO;
import net.jandan.pojo.CommentXOExample;
import net.jandan.service.CommentService;
import net.jandan.service.CommentXOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XKK
 * @create 2018-05-10 10:38
 * @desc
 **/
@Service
public class CommentXOServiceImpl implements CommentXOService {
    @Autowired
    CommentXOMapper commentXOMapper;

    @Override
    public void add(CommentXO c) {
        commentXOMapper.insert(c);
    }

    @Override
    public boolean isExist(int cid, String ip) {
        CommentXOExample example =new CommentXOExample();
        example.createCriteria().andCommentIdEqualTo(cid).andIpAddrEqualTo(ip);
        List s =    commentXOMapper.selectByExample(example);

        return s.size() >= 0;
    }


}