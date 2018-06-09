package net.jandan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XKK
 * @create 2018-06-08 14:24
 * @desc
 **/

@Controller
@RequestMapping("")
public class TestController {

    @RequestMapping("testjsp")
    public String index(){

        return "test";
    }
}