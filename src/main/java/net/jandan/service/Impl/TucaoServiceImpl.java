package net.jandan.service.Impl;


import net.jandan.mapper.TucaoMapper;
import net.jandan.mapper.TucaoMapper;
import net.jandan.pojo.*;
import net.jandan.pojo.Tucao;
import net.jandan.pojo.TucaoExample;
import net.jandan.service.CommentService;
import net.jandan.service.TucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XKK
 * @create 2018-05-10 10:38
 * @desc
 **/
@Service
public class TucaoServiceImpl implements TucaoService {
    @Autowired
    TucaoMapper tucaoMapper;

    @Override
    public void add(Tucao c) {
        tucaoMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        tucaoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Tucao u) {
        tucaoMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public Tucao get(int id) {
        return tucaoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list() {
        TucaoExample example =new TucaoExample();
        example.setOrderByClause("id desc");
        return tucaoMapper.selectByExample(example);
    }


}