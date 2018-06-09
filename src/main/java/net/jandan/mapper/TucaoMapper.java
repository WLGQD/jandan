package net.jandan.mapper;

import java.util.List;
import net.jandan.pojo.Tucao;
import net.jandan.pojo.TucaoExample;

public interface TucaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tucao record);

    int insertSelective(Tucao record);

    List<Tucao> selectByExample(TucaoExample example);

    Tucao selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tucao record);

    int updateByPrimaryKey(Tucao record);
}