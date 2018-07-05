package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.baizhi.cmfz.util.CookieUtil;
import com.baizhi.cmfz.util.ValidateCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by yx on 2018/7/4.
 */
@Controller
@RequestMapping("/mgr")
public class ManagerController {
    @Autowired
    private ManagerService managerService;


    @RequestMapping("/mgrLogin")
    public String mgrLogin(Manager manager,String enCode,Boolean rememberMe,HttpSession session,HttpServletResponse response){
        String vCode = (String)session.getAttribute("vCode");
        if(vCode.equalsIgnoreCase(enCode)){
            Manager mgr = managerService.loginMgr(manager);
            if (mgr == null) {
                return "redirect:/login.jsp";
            }
            if(rememberMe !=null && rememberMe) {
                Cookie cookie = CookieUtil.createCookie("mgrName", manager.getMgrName(), "UTF-8");
                cookie.setPath(session.getServletContext().getContextPath());
                //设置最大存活期
                cookie.setMaxAge(60);
                //加入到response中
                response.addCookie(cookie);
            }else {
                Cookie cookie = CookieUtil.createCookie("mgrName", manager.getMgrName(), "UTF-8");
                cookie.setMaxAge(-1);
                cookie.setPath(session.getServletContext().getContextPath());
                //加入到response中
                response.addCookie(cookie);
            }
                return "index";

            } else {
                return "redirect:/login.jsp";
            }
        }

    @RequestMapping("/mgrRegist")
    public String mgrRegist(Manager manager){
        managerService.registMgr(manager);
        return "success";
    }

}
