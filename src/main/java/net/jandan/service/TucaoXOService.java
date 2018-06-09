package net.jandan.service;

import net.jandan.pojo.Tucao;
import net.jandan.pojo.TucaoXO;

import java.util.List;

/**
 * @author XKK
 * @create 2018-06-08 16:18
 * @desc
 **/

public interface TucaoXOService {
    void add(TucaoXO c);

    boolean isExist(int tid,String ip);

}