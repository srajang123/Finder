package com.koders.finder.controller;

//import com.koders.finder.renderer.error.Errr;
import com.koders.finder.models.Achievement;
import com.koders.finder.models.User;
import com.koders.finder.renderer.error.Errr;
import com.koders.finder.renderer.home.Home;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FinderController implements ErrorController
{
    static final String FINDER_URI="/finder";
    static final String ERROR_URI="/error";

    private User returnFakeUser()
    {
        User user=new User();
        Achievement achievement=new Achievement();
        achievement.setCompany("google");
        achievement.setName("Google Codejam");
        achievement.setType("CP");
        user.setName("Srajan");
        user.setId("1721CS1138");
        user.setBranch("cse");
        user.setYear(4);
        user.setAchievements(achievement);
        return user;
    }
    @RequestMapping(FINDER_URI)
    public ModelAndView execute(HttpServletRequest req)
    {
        System.out.println(req);
        User user=returnFakeUser();
        try {
            Home home = new Home(user);
            ModelAndView mv = home.renderer();
            return mv;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return new ModelAndView();
    }
    @RequestMapping(ERROR_URI)

    public ModelAndView error()
    {
        Errr err=new Errr();
        ModelAndView mv=err.renderer();
        return mv;
    }

    @Override
    public String getErrorPath() {
        return ERROR_URI;
    }
}