package com.koders.finder.renderer.error;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class Errr {
    private final String VIEW_NAME="/renderer/error/Errr.jsp";

    public ModelAndView renderer()
    {
        String viewname=getViewName();
        ModelAndView mv=new ModelAndView(viewname);
        return mv;
    }
    private String getViewName()
    {
        String viewname=null;
        viewname=VIEW_NAME;
        return viewname;
    }
}
