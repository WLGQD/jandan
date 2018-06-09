package net.jandan.mapper;

import java.util.List;
import net.jandan.pojo.CommentXO;
import net.jandan.pojo.CommentXOExample;

public interface CommentXOMapper {
    int insert(CommentXO record);

    int insertSelective(CommentXO record);

    List<CommentXO> selectByExample(CommentXOExample example);
}