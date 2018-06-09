package net.jandan.service.Impl;


import net.jandan.mapper.TucaoMapper;
import net.jandan.mapper.TucaoXOMapper;
import net.jandan.pojo.*;
import net.jandan.service.TucaoService;
import net.jandan.service.TucaoXOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XKK
 * @create 2018-05-10 10:38
 * @desc
 **/
@Service
public class TucaoXOServiceImpl implements TucaoXOService {
    @Autowired
    TucaoXOMapper tucaoXoMapper;

    @Override
    public void add(TucaoXO c) {
        tucaoXoMapper.insert(c);
    }


    @Override
    public boolean isExist(int tid, String ip) {
        TucaoXOExample example =new TucaoXOExample();
        example.createCriteria().andTucaoIdEqualTo(tid).andIpAddrEqualTo(ip);
        List s =    tucaoXoMapper.selectByExample(example);

        return s.size() >= 0;
    }


}