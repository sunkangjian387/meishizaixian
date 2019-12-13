package com.gaoshu.controller;

import com.gaoshu.model.Tpzyb;
import com.gaoshu.service.TpzybService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TpzybController {
    @Autowired
    private TpzybService tpzybService;
    @RequestMapping("/selectAllTpzyb.do")
    public String selectAllTpzyb(Model model){

        return "";
    }
    @RequestMapping("/selectByTpid.do")
    public String selectByTpid(Model model,int tpid){

        return "";
    }
    @RequestMapping("/updateTpzyb.do")
    public String updateTpzyb(Model model,Tpzyb tpzyb){


        return "";
    }
    @RequestMapping("/insertTpzyb.do")
    public String insertTpzyb(Model model,Tpzyb tpzyb){


        return "";
    }

    @RequestMapping("/deleteByTpid.do")
    public String deleteByTpid(Model model,int tpid){

        return "";
    }
}
