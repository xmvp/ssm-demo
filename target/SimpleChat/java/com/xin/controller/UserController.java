package com.xin.controller;

import com.xin.pojo.User;
import com.xin.service.UserService;
import com.xin.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "login",params = {"id","password"})
    public String login(HttpServletResponse response, HttpServletRequest request){
        User user = userService.login(Integer.parseInt(request.getParameter("id")),request.getParameter("password"));
        if(user!=null){
            request.getSession().setAttribute("user",user);//存User
            return "success";
        }else {
            return "";//回到首页
        }
    }
}
