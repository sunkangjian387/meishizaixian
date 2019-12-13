package com.gaoshu.controller;

import com.gaoshu.model.Jyzpb;
import com.gaoshu.service.JyzpbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JyzpbController {
    @Autowired
    private JyzpbService jyzpbService;
    @RequestMapping("/selectAllJyzpb.do")
    public String selectAllJyzpb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Jyzpb> jyzpbs = jyzpbService.selectAllJyzpb();
        PageInfo<Jyzpb> jyzpbPageInfo = new PageInfo<>(jyzpbs);
        model.addAttribute("jyzpbPageInfo",jyzpbPageInfo);
        return "jyzpbShow";
    }
    @RequestMapping("/selectByJbid.do")
    public String selectByJbid(Model model,int jbid){

        return "";
    }
    @RequestMapping("/selectByJylb.do")
    public String selectByJylb(String jylb,Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Jyzpb> jyzpbs = jyzpbService.selectByJylb(jylb);
        PageInfo<Jyzpb> jyzpbPageInfo = new PageInfo<>(jyzpbs);
        model.addAttribute("jyzpbPageInfo",jyzpbPageInfo);
        return "jyzpbShow";

    }
    @RequestMapping("/insertJyzpb.do")
    public String insertJyzpb(Jyzpb jyzpb){

        return "";
    }

    @RequestMapping("/deleteByJbid.do")
    public  String deleteByJbid(Model model,int jbid){


        return "";
    }

}
