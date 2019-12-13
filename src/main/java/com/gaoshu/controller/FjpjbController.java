package com.gaoshu.controller;

import com.gaoshu.model.Fjb;
import com.gaoshu.model.Fjpjb;
import com.gaoshu.service.FjbService;
import com.gaoshu.service.FjpjbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FjpjbController {
    @Autowired
    private FjpjbService fjpjbService;
    @RequestMapping("/selectAllFjpjb.do")
    public String selectAllFjpjb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Fjpjb> fjpjbs = fjpjbService.selectAllFjpjb();
        PageInfo<Fjpjb> fjpjbPageInfo = new PageInfo<>(fjpjbs);
        model.addAttribute("fjpjbPageInfo",fjpjbPageInfo);
        return "fjpjbShow";
    }
    @RequestMapping("/selectByPjid.do")
    public String selectByPjid(Model model,int pjid){

        return " ";
    }
    @RequestMapping("/updateFjpjb.do")
    public String updateFjpjb(Model model,Fjpjb fjpjb){


        return "";
    }
    @RequestMapping("/insertFjpjb.do")
    public String insertFjpjb(Model model,Fjpjb fjpjb){

        return "";
    }
    @RequestMapping("/deleteByPjid.do")
    public String deleteByPjid(Model model,int pjid){

        int i = fjpjbService.deleteByPjid(pjid);

        return "selectAllFjpjb.do";
    }
}
