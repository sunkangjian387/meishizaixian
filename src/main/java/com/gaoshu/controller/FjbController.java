package com.gaoshu.controller;

import com.gaoshu.model.Fjb;
import com.gaoshu.service.FjbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FjbController {
    @Autowired
    private FjbService fjbService;

    @RequestMapping("/selectAllFjb.do")
    public String selectAllFjb(Model model,@RequestParam(required = true,defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,1);
        List<Fjb> fjbs = fjbService.selectAllFjb();
        PageInfo<Fjb> fjbPageInfo = new PageInfo<>(fjbs);
        model.addAttribute("fjbPageInfo",fjbPageInfo);

        return "fjbShow";
    }
    @RequestMapping("/selectByFjid.do")
    public String selectByFjid(Model model,int fjid){

        return "";
    }
    @RequestMapping("/updateFjb.do")
    public String updateFjb(Model model,Fjb fjb){

        return "";
    }
    @RequestMapping("/insertFjb.do")
    public String insertFjb(Model model,Fjb fjb){

        return "";
    }
    @RequestMapping("/deleteByFjid.do")
    public String deleteByFjid(Model model,int fjid){

        fjbService.deleteByFjid(fjid);
        return "selectAllFjb.do";
    }
}
