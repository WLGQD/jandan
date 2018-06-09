package net.jandan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.jandan.pojo.Comment;
import net.jandan.pojo.Tucao;
import net.jandan.service.CommentService;
import net.jandan.service.TucaoService;
import net.jandan.util.JsonUtils;
import net.jandan.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;
import com.alibaba.fastjson.JSON;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XKK
 * @create 2018-06-08 16:23
 * @desc
 **/
@Controller
@RequestMapping("pic")
public class PicCotroller {
    @Autowired
    CommentService commentService;
    @Autowired
    TucaoService tucaoService;

    @RequestMapping("add")
    public String add(Comment c){

        commentService.add(c);
        return "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Comment> ps =  commentService.list();
        int total = (int) new PageInfo<>(ps).getTotal();
        page.setTotal(total);
       // page.setParam("&cid=" + cid);
        model.addAttribute("ps",ps);
       // model.addAttribute("c",c);
        model.addAttribute("page",page);
        ;
        return "list";
    }

    @RequestMapping("delete")
    public String delete(Comment c){

        return "redirect:list";
    }


    @RequestMapping("jandan-vote")
    @ResponseBody
    public String loginAjax(@RequestParam("comment_id") int id, @RequestParam("like_type") String like_type, @RequestParam("data_type") String data_type,  HttpSession session) {

     //   if(null==user){
     //       return "fail";
     //   }
     //   session.setAttribute("user", user);
        if (data_type.equalsIgnoreCase("comment")){
            Comment c = commentService.get(id);
            if (c!=null){
                if (like_type.equalsIgnoreCase("pos")){
                    c.setLikeCount(c.getLikeCount()+1);
                }else if (like_type.equalsIgnoreCase("neg")){
                    c.setLikeCount(c.getLikeCount()+1);
                }
                commentService.update(c);
            }

        }else if (data_type.equalsIgnoreCase("tucao")){
            Tucao t = tucaoService.get(id);
            if (t!=null){
                if (like_type.equalsIgnoreCase("pos")){
                    t.setLikeCount(t.getLikeCount()+1);
                }else if (like_type.equalsIgnoreCase("neg")){
                    t.setLikeCount(t.getLikeCount()+1);
                }
                tucaoService.update(t);
            }
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("error", 0);
        map.put("msg", "0DFDFDF");
        Object obj = new Object();
        String jsonString = JSON.toJSONString(map);
        return jsonString;
    }

}