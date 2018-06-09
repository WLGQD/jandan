package net.jandan.service;

import net.jandan.pojo.Comment;
import net.jandan.pojo.Tucao;

import java.util.List;

/**
 * @author XKK
 * @create 2018-06-08 16:18
 * @desc
 **/

public interface TucaoService {
    void add(Tucao c);
    void delete(int id);
    void update(Tucao c);
    Tucao get(int id);
    List list();


}