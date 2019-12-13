package com.gaoshu.controller;

import com.gaoshu.model.Scb;
import com.gaoshu.service.ScbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ScbController {
    @Autowired
    private ScbService scbService;
    @RequestMapping("/selectAllScb.do")
    public String selectAllScb(Model model){


        return "";
    }
    @RequestMapping("/selectByScid.do")
    public String selectByScid(Model model,int scid){


        return "";
    }
    @RequestMapping("/updateScb.do")
    public String updateScb(Model model,Scb scb){


        return "";
    }
    @RequestMapping("/insertScb.do")
    public String insertScb(Model model,Scb scb){


        return "";
    }
    @RequestMapping("/deleteByScid.do")
    public String deleteByScid(Model model,int scid){

        return "";
    }
}
