package com.gaoshu.controller;

import com.gaoshu.model.Jysqb;
import com.gaoshu.service.JysqbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JysqbCoontroller {
    @Autowired
    private JysqbService jysqbService;
    @RequestMapping("/selectAllJysqb.do")
    public String selectAllJysqb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Jysqb> jysqbs = jysqbService.selectAllJysqb();
        PageInfo<Jysqb> jysqbPageInfo = new PageInfo<>(jysqbs);
        model.addAttribute("jysqbPageInfo",jysqbPageInfo);
        return "jysqbShow";
    }

    @RequestMapping("/selectByjyid.do")
    public String selectByjyid(Model model,int jyid){


        return "";
    }
    @RequestMapping("/updateJysqb.do")
    public String updateJysqb(Model model,Jysqb jysqb){


        return "";
    }
    @RequestMapping("/insertJysqb.do")
    public String insertJysqb(Model model,Jysqb jysqb){

        return "";
    }
    @RequestMapping("/deleteByjyid.do")
    public String deleteByjyid(Model model,int jyid){

        int i = jysqbService.deleteByjyid(jyid);
        return "selectAllJysqb.do";
    }
}
