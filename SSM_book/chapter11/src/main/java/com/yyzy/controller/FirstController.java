package com.yyzy.controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 创建ModelAndView 对象
        ModelAndView mav = new ModelAndView();
        // 向模型对象中添加数据
        mav.addObject("msg", "这是我的第一个Spring MVC程序");     // 设置逻辑视图名
        mav.setViewName("/WEB-INF/jsp/first.jsp");             // 返回ModelAndView 对象
        return mav;
    }

    public ModelAndView handleRequest(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws Exception {
        return null;
    }
}
