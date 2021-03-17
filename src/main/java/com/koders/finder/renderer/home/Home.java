package com.koders.finder.renderer.home;

import com.koders.finder.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class Home {
    private final String VIEW_NAME="/renderer/home/Home.jsp";
    @Autowired
    User user;
    public Home(User user)
    {
        this.user=user;
    }
    public ModelAndView renderer()
    {
        String viewname=getViewName();
        ModelAndView mv=new ModelAndView(viewname);
        mv.addObject("user",user);
        return mv;
    }
    private String getViewName()
    {
        String viewname=null;
        viewname=VIEW_NAME;
        return viewname;
    }
}
