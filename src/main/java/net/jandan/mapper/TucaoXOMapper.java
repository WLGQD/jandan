package net.jandan.mapper;

import java.util.List;
import net.jandan.pojo.TucaoXO;
import net.jandan.pojo.TucaoXOExample;

public interface TucaoXOMapper {
    int insert(TucaoXO record);

    int insertSelective(TucaoXO record);

    List<TucaoXO> selectByExample(TucaoXOExample example);
}